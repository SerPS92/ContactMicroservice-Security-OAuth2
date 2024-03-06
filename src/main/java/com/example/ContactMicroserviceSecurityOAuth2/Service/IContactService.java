package com.example.ContactMicroserviceSecurityOAuth2.Service;






import com.example.ContactMicroserviceSecurityOAuth2.Model.Contact;

import java.util.List;

public interface IContactService {
    boolean addContact(Contact contact);
    Contact showContact(String email);
    void deleteContact(String email);
    List<Contact> findAll();
    void deleteContact(int id);
    Contact showContact(int id);
    void updateContact(Contact contact);
}
