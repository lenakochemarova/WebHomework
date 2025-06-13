package dataBase.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import dataBase.data.Contact;

public class ContactDto {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;

    public ContactDto(Contact contact) {
        this.id = contact.getId();
        this.name = contact.getName();
        this.phoneNumber = contact.getPhoneNumber();
        this.email = contact.getEmail();
    }

    public ContactDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
