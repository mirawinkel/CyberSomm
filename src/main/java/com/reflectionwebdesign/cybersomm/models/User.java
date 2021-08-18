package com.reflectionwebdesign.cybersomm.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false, length = 60)
    @NotNull(message="Can't be empty")
    private String email;

    @Column
    @NotNull
    protected String username;

    @Column
//    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})",message = "Enter valid password")
    @NotNull(message="Can't be empty")
    protected String password;

    private String role;

    @OneToMany
    @ToString.Exclude
    protected Set<Wine> favorites;

    @Transient
    private String passwordRepeat;

    @Transient
    public boolean isEquals;

    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = "USER";
    }

    public User() {
        this.role = "USER";
    }

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
        return email.equals(user.email) && username.equals(user.username) && password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return 562048007;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "email = " + email + ", " +
                "name = " + username + ", " +
                "password = " + password + ")";
    }
}
