package com.reflectionwebdesign.cybersomm.services;

import com.reflectionwebdesign.cybersomm.models.Contact;

public interface ContactService {
    Contact findContactByEmail(String email);
    Iterable<Contact> findAll();
    void deleteContactByEmail(String email);
}
