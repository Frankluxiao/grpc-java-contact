package com.grpc.contact.server;//package com.grpc.contact.server;
//
//import com.google.protobuf.Timestamp;
//
//import com.proto.contact.Contact;
//
//import org.bson.types.ObjectId;
//import org.mapstruct.InheritInverseConfiguration;
//import org.mapstruct.InjectionStrategy;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Named;
//import org.mapstruct.factory.Mappers;
//
//import java.time.Instant;
//
//
//@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR)
//public interface ContactMapper {
//
//  ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);
//
//  @Mapping(target = "id", source = "contact.id", qualifiedByName = "stringIdToObjectIdMapper")
//  @Mapping(target = "emails", source = "contact.emailsList")
//  @Mapping(target = "phones", source = "contact.phonesList")
//  @Mapping(target = "tags", source = "contact.tagsList")
//  @Mapping(target = "addresses", source = "contact.addressesList")
//  @Mapping(target = "creationDate", source = "contact.creationDate", qualifiedByName = "timeStampToInstantMapper")
//  ContactPOJO sourceToTarget(Contact contact);
//
//  @Mapping(target = "id", source = "contactPOJO.id", qualifiedByName = "objectIdToStringIdMapper")
//  @Mapping(target = "emailsList", source = "contactPOJO.emails")
//  @Mapping(target = "phonesList", source = "contactPOJO.phones")
//  @Mapping(target = "tagsList", source = "contactPOJO.tags")
//  @Mapping(target = "addressesList", source = "contactPOJO.addresses")
//  @Mapping(target = "creationDate", source = "contactPOJO.creationDate", qualifiedByName = "instantToTimestampMapper")
//  Contact targetToSource(ContactPOJO contactPOJO);
//
//
//
//  @Named("stringIdToObjectIdMapper")
//  default ObjectId stringIdToObjectId(String id) {
//    return new ObjectId(id);
//  }
//
//  @Named("timeStampToInstantMapper")
//  default Instant timeStampToInstant(Timestamp timestamp) {
//    return Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());
//  }
//
//  @Named("objectIdToStringIdMapper")
//  default String objectIdToStringId(ObjectId id) {
//    return id.toString();
//  }
//
//  @Named("instantToTimestampMapper")
//  default Timestamp instantToTimeStamp(Instant instant) {
//    return Timestamp.newBuilder()
//        .setSeconds(instant.getEpochSecond())
//        .setNanos(instant.getNano())
//        .build();
//  }
//
//}