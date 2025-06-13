package dataBase.data;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ContactDao {
    private long id=1L;
    private final Map<Long,Contact> map;

    public ContactDao() {
        this.map = new HashMap<>();
    }

    public Contact addContact(String name, String phoneNumber, String email){
        Contact contact = new Contact(id,name,phoneNumber,email);
        map.put(id++, contact);
        return contact;
    }

    public Contact getContact(Long id) {
        return map.get(id);
    }
}
