package com.grpc.contact.server;

import com.google.protobuf.Timestamp;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.proto.contact.Contact;
import com.proto.contact.ContactServiceGrpc;
import com.proto.contact.CreateContactRequest;
import com.proto.contact.CreateContactResponse;
import com.proto.contact.GetContactRequest;
import com.proto.contact.GetContactResponse;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

import io.grpc.stub.StreamObserver;

import static com.mongodb.MongoClient.getDefaultCodecRegistry;
import static com.mongodb.client.model.Filters.eq;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class ContactServiceImpl extends ContactServiceGrpc.ContactServiceImplBase{

  private MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
  private MongoDatabase database = mongoClient.getDatabase("agent_contacts");

  private CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(),
      fromProviders(PojoCodecProvider.builder().automatic(true).build()));
  private MongoCollection<ContactPOJO> mongoCollection = database
      .withCodecRegistry(pojoCodecRegistry)
      .getCollection("contact", ContactPOJO.class);

  @Override
  public void createContact(CreateContactRequest request, StreamObserver<CreateContactResponse> responseObserver) {

    Contact contact = request.getContact();
    Instant creationDate = Instant.now();

    ContactPOJO contactPOJO = mapToPOJO(contact, creationDate);

    //ContactPOJO contactPOJOTest = ContactMapper.INSTANCE.sourceToTarget(contact);

    mongoCollection.insertOne(contactPOJO);

    String id = contactPOJO.getId().toString();

    CreateContactResponse createContactResponse = CreateContactResponse.newBuilder()
        .setContact(contact.toBuilder()
            .setId(id)
            .setCreationDate(Timestamp.newBuilder()
                .setSeconds(creationDate.getEpochSecond())
                .setNanos(creationDate.getNano())
                .build())
            .build())
        .build();

    responseObserver.onNext(createContactResponse);
    responseObserver.onCompleted();
  }


  @Override
  public StreamObserver<CreateContactRequest> createStreamContact(StreamObserver<CreateContactResponse> responseObserver) {

    return new StreamObserver<CreateContactRequest>() {

      @Override
      public void onNext(CreateContactRequest value) {

        Contact contact = value.getContact();
        Instant creationDate = Instant.now();

        ContactPOJO contactPOJO = mapToPOJO(contact, creationDate);

        //ContactMapper contactMapper = ContactMapper.INSTANCE;


        //ContactPOJO contactPOJOTest = ContactMapper.INSTANCE.sourceToTarget(contact);

        mongoCollection.insertOne(contactPOJO);

        String id = contactPOJO.getId().toString();

        CreateContactResponse createContactResponse = CreateContactResponse.newBuilder()
            .setContact(contact.toBuilder()
                .setId(id)
                .setCreationDate(Timestamp.newBuilder()
                    .setSeconds(creationDate.getEpochSecond())
                    .setNanos(creationDate.getNano())
                    .build())
                .build())
            .build();

        responseObserver.onNext(createContactResponse);
      }

      @Override
      public void onError(Throwable t) {

      }

      @Override
      public void onCompleted() {
        responseObserver.onCompleted();
      }
    };
  }

  @Override
  public void getContact(GetContactRequest request, StreamObserver<GetContactResponse> responseObserver) {

    String id = request.getId();

    ContactPOJO contactPOJO = mongoCollection.find(eq("_id", id)).first();


    if (Objects.isNull(contactPOJO)) {

      throw new RuntimeException("Failed to find ID = " + id + " in database. Is it invalid?");
    }

    Contact contact = mapper(contactPOJO);

    //Contact contactTest = ContactMapper.INSTANCE.targetToSource(contactPOJO);

    GetContactResponse getContactResponse = GetContactResponse.newBuilder()
        .setContact(contact)
        .build();

    responseObserver.onNext(getContactResponse);
    responseObserver.onCompleted();
  }



  private Contact mapper(ContactPOJO contactPOJO) {

    return Contact.newBuilder()
        .setId(contactPOJO.getId())
        .setAgentGuid(contactPOJO.getAgentGuid())
        .setFirstName(contactPOJO.getFirstName())
        .setLastName(contactPOJO.getLastName())
        .addAllEmails(contactPOJO.getEmails())
        .addAllPhones(contactPOJO.getPhones())
        .setComments(contactPOJO.getComments())
        .addAllTags(contactPOJO.getTags())
        .addAllAddresses(contactPOJO.getAddresses())
        .setCreationDate(Timestamp.newBuilder()
            .setSeconds(contactPOJO.getCreationDate().getEpochSecond())
            .setNanos(contactPOJO.getCreationDate().getNano())
            .build())
        .build();
  }



  private ContactPOJO mapToPOJO(Contact contact, Instant creationDate) {

    return ContactPOJO.builder()
        .id(UUID.randomUUID().toString())
        .agentGuid(contact.getAgentGuid())
        .firstName(contact.getFirstName())
        .lastName(contact.getLastName())
        .emails(contact.getEmailsList())
        .phones(contact.getPhonesList())
        .comments(contact.getComments())
        .tags(contact.getTagsList())
        .addresses(contact.getAddressesList())
        .creationDate(creationDate)
        .build();
  }

}
