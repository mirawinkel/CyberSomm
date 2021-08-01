package com.reflectionwebdesign.cybersomm.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
public @Getter
@Setter
@ToString
@RequiredArgsConstructor
class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "email", nullable = false, length = 60)
    private String email;

    @Column()
    protected String name;

    @Column
    protected String password;

    @OneToMany
    @ToString.Exclude
    @ElementCollection
    protected Set<Wine> favorites;

    @OneToMany
    @ToString.Exclude
    @ElementCollection
    protected Set<Wine> purchases;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Objects.equals(favorites, user.favorites) && Objects.equals(purchases, user.purchases);
    }

    @Override
    public int hashCode() {
        return 562048007;
    }
}
