package com.grpc.contact.client;

import com.proto.contact.Contact;
import com.proto.contact.ContactServiceGrpc;
import com.proto.contact.CreateContactRequest;
import com.proto.contact.CreateContactResponse;
import com.proto.contact.GetContactRequest;
import com.proto.contact.GetContactResponse;
import com.proto.contact.Phone;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ContactClient {

  public static void main(String[] args) {
    System.out.println("Hello, I am a gRPC client");

    ContactClient main = new ContactClient();
    main.run();
  }


  private void run() {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext()
        .build();

    doCall(channel);
    //doBiDiStreamingCall(channel);


    //doGetCall(channel);
    System.out.println("Shutting down channel");
    channel.shutdown();
  }

  private void doCall(ManagedChannel channel) {

    ContactServiceGrpc.ContactServiceBlockingStub contactClient = ContactServiceGrpc.newBlockingStub(channel);

    Contact contact = Contact.newBuilder()
        .setAgentGuid("agent_test_guid")
        .setFirstName("Frank")
        .setLastName("Lu")
        .build();


    CreateContactResponse createResponse = contactClient.createContact(CreateContactRequest.newBuilder()
        .setContact(contact).build());
    System.out.println(createResponse.toString());


    GetContactResponse getResponse = contactClient.getContact(GetContactRequest.newBuilder()
        .setId(createResponse.getContact().getId()).build());

    System.out.println(getResponse.toString());


  }



  private void doBiDiStreamingCall(ManagedChannel channel) {

    ContactServiceGrpc.ContactServiceStub asyncClient = ContactServiceGrpc.newStub(channel);

    CountDownLatch latch = new CountDownLatch(1);

    StreamObserver<CreateContactRequest> requestObserver = asyncClient.createStreamContact(new StreamObserver<CreateContactResponse>() {
      @Override
      public void onNext(CreateContactResponse value) {
        System.out.println("Response from server: " + value.getContact().toString());
      }

      @Override
      public void onError(Throwable t) {
        latch.countDown();
      }

      @Override
      public void onCompleted() {
        System.out.println("Server is done sending data");
        latch.countDown();
      }
    });

    Phone phoneHome = Phone.newBuilder()
        .setPhoneNumber("321-123-1234")
        .setType("Home")
        .build();

    Phone phoneWork = Phone.newBuilder()
        .setPhoneNumber("321-123-1235")
        .setType("Work")
        .build();

    Contact contact = Contact.newBuilder()
        .setAgentGuid("agent_test_guid")
        .setFirstName("Frank")
        .setLastName("Lu")
        .addAllPhones(Arrays.asList(phoneHome, phoneWork))
        .build();


    Arrays.asList(contact).forEach(
            c -> requestObserver.onNext(CreateContactRequest.newBuilder()
                .setContact(c)
                .build()
            ));

    requestObserver.onCompleted();

    try {
      latch.await(1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


  private void doGetCall(ManagedChannel channel) {

    ContactServiceGrpc.ContactServiceBlockingStub contactClient = ContactServiceGrpc.newBlockingStub(channel);

    GetContactResponse getResponse = contactClient.getContact(GetContactRequest.newBuilder()
        .setId("5cbc27b40199d81cbd81c4d7").build());

    System.out.println(getResponse.toString());
  }
}
