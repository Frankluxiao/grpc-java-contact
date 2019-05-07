package com.proto.contact;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: contact/contact.proto")
public final class ContactServiceGrpc {

  private ContactServiceGrpc() {}

  public static final String SERVICE_NAME = "blog.ContactService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.contact.CreateContactRequest,
      com.proto.contact.CreateContactResponse> getCreateContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateContact",
      requestType = com.proto.contact.CreateContactRequest.class,
      responseType = com.proto.contact.CreateContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.contact.CreateContactRequest,
      com.proto.contact.CreateContactResponse> getCreateContactMethod() {
    io.grpc.MethodDescriptor<com.proto.contact.CreateContactRequest, com.proto.contact.CreateContactResponse> getCreateContactMethod;
    if ((getCreateContactMethod = ContactServiceGrpc.getCreateContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getCreateContactMethod = ContactServiceGrpc.getCreateContactMethod) == null) {
          ContactServiceGrpc.getCreateContactMethod = getCreateContactMethod = 
              io.grpc.MethodDescriptor.<com.proto.contact.CreateContactRequest, com.proto.contact.CreateContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blog.ContactService", "CreateContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.CreateContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.CreateContactResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("CreateContact"))
                  .build();
          }
        }
     }
     return getCreateContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.contact.CreateContactRequest,
      com.proto.contact.CreateContactResponse> getCreateStreamContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStreamContact",
      requestType = com.proto.contact.CreateContactRequest.class,
      responseType = com.proto.contact.CreateContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.contact.CreateContactRequest,
      com.proto.contact.CreateContactResponse> getCreateStreamContactMethod() {
    io.grpc.MethodDescriptor<com.proto.contact.CreateContactRequest, com.proto.contact.CreateContactResponse> getCreateStreamContactMethod;
    if ((getCreateStreamContactMethod = ContactServiceGrpc.getCreateStreamContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getCreateStreamContactMethod = ContactServiceGrpc.getCreateStreamContactMethod) == null) {
          ContactServiceGrpc.getCreateStreamContactMethod = getCreateStreamContactMethod = 
              io.grpc.MethodDescriptor.<com.proto.contact.CreateContactRequest, com.proto.contact.CreateContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "blog.ContactService", "CreateStreamContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.CreateContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.CreateContactResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("CreateStreamContact"))
                  .build();
          }
        }
     }
     return getCreateStreamContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.contact.GetContactRequest,
      com.proto.contact.GetContactResponse> getGetContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContact",
      requestType = com.proto.contact.GetContactRequest.class,
      responseType = com.proto.contact.GetContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.contact.GetContactRequest,
      com.proto.contact.GetContactResponse> getGetContactMethod() {
    io.grpc.MethodDescriptor<com.proto.contact.GetContactRequest, com.proto.contact.GetContactResponse> getGetContactMethod;
    if ((getGetContactMethod = ContactServiceGrpc.getGetContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getGetContactMethod = ContactServiceGrpc.getGetContactMethod) == null) {
          ContactServiceGrpc.getGetContactMethod = getGetContactMethod = 
              io.grpc.MethodDescriptor.<com.proto.contact.GetContactRequest, com.proto.contact.GetContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blog.ContactService", "GetContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.GetContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.GetContactResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("GetContact"))
                  .build();
          }
        }
     }
     return getGetContactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContactServiceStub newStub(io.grpc.Channel channel) {
    return new ContactServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContactServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContactServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContactServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContactServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ContactServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createContact(com.proto.contact.CreateContactRequest request,
        io.grpc.stub.StreamObserver<com.proto.contact.CreateContactResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateContactMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.contact.CreateContactRequest> createStreamContact(
        io.grpc.stub.StreamObserver<com.proto.contact.CreateContactResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreateStreamContactMethod(), responseObserver);
    }

    /**
     */
    public void getContact(com.proto.contact.GetContactRequest request,
        io.grpc.stub.StreamObserver<com.proto.contact.GetContactResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContactMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.contact.CreateContactRequest,
                com.proto.contact.CreateContactResponse>(
                  this, METHODID_CREATE_CONTACT)))
          .addMethod(
            getCreateStreamContactMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.contact.CreateContactRequest,
                com.proto.contact.CreateContactResponse>(
                  this, METHODID_CREATE_STREAM_CONTACT)))
          .addMethod(
            getGetContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.contact.GetContactRequest,
                com.proto.contact.GetContactResponse>(
                  this, METHODID_GET_CONTACT)))
          .build();
    }
  }

  /**
   */
  public static final class ContactServiceStub extends io.grpc.stub.AbstractStub<ContactServiceStub> {
    private ContactServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactServiceStub(channel, callOptions);
    }

    /**
     */
    public void createContact(com.proto.contact.CreateContactRequest request,
        io.grpc.stub.StreamObserver<com.proto.contact.CreateContactResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.contact.CreateContactRequest> createStreamContact(
        io.grpc.stub.StreamObserver<com.proto.contact.CreateContactResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCreateStreamContactMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getContact(com.proto.contact.GetContactRequest request,
        io.grpc.stub.StreamObserver<com.proto.contact.GetContactResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContactServiceBlockingStub extends io.grpc.stub.AbstractStub<ContactServiceBlockingStub> {
    private ContactServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.contact.CreateContactResponse createContact(com.proto.contact.CreateContactRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.contact.GetContactResponse getContact(com.proto.contact.GetContactRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetContactMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContactServiceFutureStub extends io.grpc.stub.AbstractStub<ContactServiceFutureStub> {
    private ContactServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.contact.CreateContactResponse> createContact(
        com.proto.contact.CreateContactRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateContactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.contact.GetContactResponse> getContact(
        com.proto.contact.GetContactRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CONTACT = 0;
  private static final int METHODID_GET_CONTACT = 1;
  private static final int METHODID_CREATE_STREAM_CONTACT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContactServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContactServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CONTACT:
          serviceImpl.createContact((com.proto.contact.CreateContactRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.contact.CreateContactResponse>) responseObserver);
          break;
        case METHODID_GET_CONTACT:
          serviceImpl.getContact((com.proto.contact.GetContactRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.contact.GetContactResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_STREAM_CONTACT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createStreamContact(
              (io.grpc.stub.StreamObserver<com.proto.contact.CreateContactResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContactServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.contact.ContactOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContactService");
    }
  }

  private static final class ContactServiceFileDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier {
    ContactServiceFileDescriptorSupplier() {}
  }

  private static final class ContactServiceMethodDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContactServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ContactServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContactServiceFileDescriptorSupplier())
              .addMethod(getCreateContactMethod())
              .addMethod(getCreateStreamContactMethod())
              .addMethod(getGetContactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
