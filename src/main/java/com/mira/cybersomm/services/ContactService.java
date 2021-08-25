package com.mira.cybersomm.services;

import com.mira.cybersomm.models.Contact;

public interface ContactService {
    Contact findContactByEmail(String email);
    Iterable<Contact> findAll();
    Contact save(Contact contact);
    void deleteContactByEmailContaining(String email);
}
