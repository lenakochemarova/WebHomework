package dataBase.controller;

import dataBase.data.Contact;
import dataBase.data.ContactDao;
import dataBase.facade.ContactFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactFacade facade;

    @Autowired
    public ContactController(ContactFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public ContactDto createContact(@RequestParam(name = "name") String name,
                                    @RequestParam(name = "phoneNumber") String phoneNumber,
                                    @RequestParam(name = "email") String email) {
        return facade.createContact(name, phoneNumber, email);
    }

    @GetMapping
    public List<Contact> getContacts() {
        return facade.getContacts();
    }

    @GetMapping("/{id}")
    public ContactDto getContact(@PathVariable(name = "id") Long id) {
        return facade.getContact(id);
    }

    @PutMapping("/{id}")
    public ContactDto changeContact(@PathVariable(name = "id") Long id, @RequestBody ContactDto contact) {
        contact.setId(id);
        return facade.changeContact(id, contact);
    }
}
