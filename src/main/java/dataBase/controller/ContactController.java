package dataBase.controller;

import dataBase.facade.ContactFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactFacade facade;

    @Autowired
    public ContactController(ContactFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public ContactDto createContact(@RequestParam String name, @RequestParam String phoneNumber, @RequestParam String email){
        return facade.createContact(name,phoneNumber,email);
    }

    @GetMapping("/{id}")
    public ContactDto getContact(@PathVariable Long id){
        return facade.getContact(id);
    }

//    @PutMapping("/{contactId}")
//    public ContactDto changeContact(@PathVariable Long id, @RequestParam String str){
//        return facade.changeContact(id,)
//    }
}
