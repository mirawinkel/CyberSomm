package com.mira.cybersomm.models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mira.cybersomm.config.ValidEmail;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    //utilizing email as Id because email addresses are unique and it eliminates the need for identification numbers
    @Id
    @Column(nullable = false, length = 60)
    @NotNull(message="Can't be empty")
    @NotEmpty
    @ValidEmail
    private String email;

    @Column
    @NotNull
    protected String username;

    @Column
    @NotNull(message="Can't be empty")
    @NotEmpty
    protected String password;

    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(
                    name = "user_email",
                    referencedColumnName = "email"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id",
                    referencedColumnName = "role_id")
    )
    @JsonManagedReference
    private Set<Role> roles = new HashSet<>();

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
    }

    public User() {
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
