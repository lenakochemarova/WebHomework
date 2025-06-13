package dataBase.data;

public class Contact {

    private long id;
    private final String name;
    private final String phoneNumber;
    private final String email;

    public Contact(long id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }
}
