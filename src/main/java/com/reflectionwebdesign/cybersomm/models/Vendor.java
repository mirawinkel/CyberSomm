package com.reflectionwebdesign.cybersomm.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

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
class Vendor implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column
    protected String name;

    @Column
    protected String city;

    @Column
    protected String state;

    @Column
    protected String country;

    @OneToMany
    @ToString.Exclude
    @ElementCollection
    protected Set<Wine> wineList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Vendor vendor = (Vendor) o;

        return Objects.equals(id, vendor.id);
    }

    @Override
    public int hashCode() {
        return 1008127744;
    }
}
