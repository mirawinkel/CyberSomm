package com.mira.cybersomm.services.impl;

import com.mira.cybersomm.models.Contact;
import com.mira.cybersomm.repositories.ContactRepository;
import com.mira.cybersomm.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void deleteContactByEmailContaining(String email) {
        contactRepository.deleteContactByEmailContaining(email);
    }

    @Override
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }
}
