package com.mira.cybersomm.repositories;

import com.mira.cybersomm.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    Contact findContactByEmail(String email);
    Iterable<Contact> findAll();
    void deleteContactByEmailContaining(String email);
}
