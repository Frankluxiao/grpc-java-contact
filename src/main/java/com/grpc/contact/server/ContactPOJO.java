package com.grpc.contact.server;

import com.proto.contact.Address;
import com.proto.contact.Email;
import com.proto.contact.Phone;
import com.proto.contact.Tag;

import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//public class ContactPOJO implements Serializable {
public class ContactPOJO {

    private String id;
    private String agentGuid;
    private String firstName;
    private String lastName;
    private String comments;
    private List<Tag> tags;
    private List<Email> emails;
    private List<Phone> phones;
    private List<Address> addresses;
    private Instant creationDate;
}