// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contact/contact.proto

package com.proto.contact;

public final class ContactOuterClass {
  private ContactOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_Contact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_Contact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_CreateContactRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_CreateContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_CreateContactResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_CreateContactResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_GetContactRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_GetContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_GetContactResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_GetContactResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_Email_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_Email_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_Phone_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_Phone_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_Tag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_Tag_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025contact/contact.proto\022\004blog\032\037google/pr" +
      "otobuf/timestamp.proto\"\212\002\n\007Contact\022\n\n\002id" +
      "\030\001 \001(\t\022\022\n\nagent_guid\030\002 \001(\t\022\022\n\nfirst_name" +
      "\030\003 \001(\t\022\021\n\tlast_name\030\004 \001(\t\022\020\n\010comments\030\005 " +
      "\001(\t\022\027\n\004tags\030\006 \003(\0132\t.blog.Tag\022\033\n\006emails\030\007" +
      " \003(\0132\013.blog.Email\022\033\n\006phones\030\010 \003(\0132\013.blog" +
      ".Phone\022 \n\taddresses\030\t \003(\0132\r.blog.Address" +
      "\0221\n\rcreation_date\030\n \001(\0132\032.google.protobu" +
      "f.Timestamp\"6\n\024CreateContactRequest\022\036\n\007c" +
      "ontact\030\001 \001(\0132\r.blog.Contact\"7\n\025CreateCon" +
      "tactResponse\022\036\n\007contact\030\001 \001(\0132\r.blog.Con" +
      "tact\"\037\n\021GetContactRequest\022\n\n\002id\030\001 \001(\t\"4\n" +
      "\022GetContactResponse\022\036\n\007contact\030\001 \001(\0132\r.b" +
      "log.Contact\"\'\n\005Email\022\020\n\010email_id\030\001 \001(\t\022\014" +
      "\n\004type\030\002 \001(\t\"+\n\005Phone\022\024\n\014phone_number\030\001 " +
      "\001(\t\022\014\n\004type\030\002 \001(\t\"v\n\007Address\022\026\n\016address_" +
      "line_1\030\001 \001(\t\022\026\n\016address_line_2\030\002 \001(\t\022\014\n\004" +
      "city\030\003 \001(\t\022\r\n\005state\030\004 \001(\t\022\020\n\010zip_code\030\005 " +
      "\001(\t\022\014\n\004type\030\006 \001(\t\"\027\n\003Tag\022\020\n\010tag_name\030\001 \001" +
      "(\t2\365\001\n\016ContactService\022J\n\rCreateContact\022\032" +
      ".blog.CreateContactRequest\032\033.blog.Create" +
      "ContactResponse\"\000\022T\n\023CreateStreamContact" +
      "\022\032.blog.CreateContactRequest\032\033.blog.Crea" +
      "teContactResponse\"\000(\0010\001\022A\n\nGetContact\022\027." +
      "blog.GetContactRequest\032\030.blog.GetContact" +
      "Response\"\000B\025\n\021com.proto.contactP\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_blog_Contact_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_blog_Contact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_Contact_descriptor,
        new java.lang.String[] { "Id", "AgentGuid", "FirstName", "LastName", "Comments", "Tags", "Emails", "Phones", "Addresses", "CreationDate", });
    internal_static_blog_CreateContactRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_blog_CreateContactRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_CreateContactRequest_descriptor,
        new java.lang.String[] { "Contact", });
    internal_static_blog_CreateContactResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_blog_CreateContactResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_CreateContactResponse_descriptor,
        new java.lang.String[] { "Contact", });
    internal_static_blog_GetContactRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_blog_GetContactRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_GetContactRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_blog_GetContactResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_blog_GetContactResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_GetContactResponse_descriptor,
        new java.lang.String[] { "Contact", });
    internal_static_blog_Email_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_blog_Email_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_Email_descriptor,
        new java.lang.String[] { "EmailId", "Type", });
    internal_static_blog_Phone_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_blog_Phone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_Phone_descriptor,
        new java.lang.String[] { "PhoneNumber", "Type", });
    internal_static_blog_Address_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_blog_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_Address_descriptor,
        new java.lang.String[] { "AddressLine1", "AddressLine2", "City", "State", "ZipCode", "Type", });
    internal_static_blog_Tag_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_blog_Tag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_Tag_descriptor,
        new java.lang.String[] { "TagName", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
