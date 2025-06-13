package dataBase;

import dataBase.data.ContactDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ContactDao contactDao = new ContactDao();

        contactDao.addContact("lll","4654","dfsf");
        SpringApplication.run(Main.class, args);
    }
}
