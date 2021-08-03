package com.reflectionwebdesign.cybersomm.repositories;

import com.reflectionwebdesign.cybersomm.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    Contact findContactByEmail(String email);
    Iterable<Contact> findAll();
    void deleteContactByEmail(String email);
}
