package com.mira.cybersomm.controllers;

import com.mira.cybersomm.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @Autowired
    private JavaMailSender mailSender;

    public void sendmail(Contact contact) {
        SimpleMailMessage msg = new SimpleMailMessage();
        String text = "From: " + contact.getEmail() + "\n\n" + contact.getName() + "\n" + contact.getMessage();
        msg.setFrom(contact.getEmail());
        msg.setTo("mira@reflectionwebdesign.com");
        msg.setSubject(contact.getSubject());
        msg.setText(text);
        mailSender.send(msg);
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public  String contactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String contactSubmit(@ModelAttribute Contact contact, Model model) {
        model.addAttribute("contact", contact);
        sendmail(contact);
        return "result";
    }
}