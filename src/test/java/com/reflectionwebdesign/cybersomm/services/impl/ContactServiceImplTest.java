package com.reflectionwebdesign.cybersomm.services.impl;

import com.reflectionwebdesign.cybersomm.models.Contact;
import com.reflectionwebdesign.cybersomm.services.ContactService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ContactServiceImplTest {
    @Autowired
    private ContactService contactService;

    @Test
    void testFindContactByEmail() {
        Contact contact = new Contact();
        contact.setEmail("test@test.com");
        contactService.save(contact);
        Contact result = contactService.findContactByEmail("test@test.com");
        assertEquals(contact, result);
    }

    @Test
    void testFindAll() {
        Contact contact = new Contact();
        contact.setEmail("test@test.com");
        contactService.save(contact);
        Contact contact2 = new Contact();
        contact2.setEmail("test2@test.com");
        contactService.save(contact2);
        Iterable<Contact> results = contactService.findAll();
        assertNotNull(results);
    }

    @Test
    void testDeleteContactByEmailContaining() {
        Contact contact = new Contact();
        contact.setEmail("test@test.com");
        contactService.save(contact);
        Contact contact2 = new Contact();
        contact2.setEmail("test2@test.com");
        contactService.save(contact2);
        contactService.deleteContactByEmailContaining("test@test.com");
        Iterable<Contact> results = contactService.findAll();
        results.forEach(result -> assertNotEquals("test@test.com", result.getEmail()));
    }
}
