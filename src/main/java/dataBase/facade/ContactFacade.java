package dataBase.facade;

import dataBase.controller.ContactDto;
import dataBase.data.Contact;
import dataBase.data.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactFacade {

    private final ContactDao contactDao;

    @Autowired
    public ContactFacade(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public ContactDto createContact(String name, String phoneNumber, String email) {
        return new ContactDto(contactDao.addContact(name, phoneNumber, email));
    }

    public ContactDto getContact(Long id) {
        Contact contact = contactDao.getContact(id);
        return new ContactDto(contact);
    }

    public List<Contact> getContacts() {
        return new ArrayList<>(contactDao.getContacts());
    }

    public ContactDto changeContact(Long id, ContactDto contactDto) {
        Contact contact = contactDao.getContact(id);
        return new ContactDto(contactDao.changeContact(contact, contactDto));
    }
}
