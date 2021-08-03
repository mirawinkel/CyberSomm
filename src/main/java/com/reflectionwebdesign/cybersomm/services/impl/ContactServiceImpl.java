package com.reflectionwebdesign.cybersomm.services.impl;

import com.reflectionwebdesign.cybersomm.models.Contact;
import com.reflectionwebdesign.cybersomm.repositories.ContactRepository;
import com.reflectionwebdesign.cybersomm.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact findContactByEmail(String email) {
        return contactRepository.findContactByEmail(email);
    }

    @Override
    public Iterable<Contact> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public void deleteContactByEmail(String email) {
        contactRepository.deleteContactByEmail(email);
    }
}
