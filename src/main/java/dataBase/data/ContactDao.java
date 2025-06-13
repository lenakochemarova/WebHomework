package dataBase.data;

import dataBase.controller.ContactDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ContactDao {
    private long id = 1L;
    private final Map<Long, Contact> map;

    public ContactDao() {
        this.map = new HashMap<>();
    }

    public Contact addContact(String name, String phoneNumber, String email) {
        Contact contact = new Contact(id, name, phoneNumber, email);
        map.put(id++, contact);
        return contact;
    }

    public Contact getContact(Long id) {
        return map.get(id);
    }

    public List<Contact> getContacts() {
        return map.values().stream().toList();
    }

    public Contact changeContact(Contact contact, ContactDto contactDto) {
        if (contactDto.getName() != null)
            contact.setName(contactDto.getName());
        if (contactDto.getPhoneNumber() != null)
            contact.setPhoneNumber(contactDto.getPhoneNumber());
        if (contactDto.getEmail() != null)
            contact.setEmail(contactDto.getEmail());
        return contact;
    }
}
