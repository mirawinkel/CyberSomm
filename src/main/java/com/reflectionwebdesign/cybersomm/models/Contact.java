package com.reflectionwebdesign.cybersomm.models;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Objects;

@Entity
public @Getter
@Setter
@ToString
@RequiredArgsConstructor
class Contact implements Serializable {
    @Transient
    private final long serialVersionUID= 1L;

    @Id
    @Column(nullable = false, length = 60)
    private String email;

    String name;

    @Transient
    String subject;

    @Transient
    String message;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Contact contact = (Contact) o;

        return Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return 590563367;
    }
}
