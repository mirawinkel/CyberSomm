package com.reflectionwebdesign.cybersomm.models;


import lombok.*;
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
class Wine implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column
    protected String name;

    @Column
    protected String producer;

    @Column
    protected int vintage;

    @Column
    protected String varietal;

    @Column
    protected String appellation;

    @Column
    protected String country;

    @Column
    @ElementCollection
    protected Set<String> descriptor;

    @Column
    protected double price;

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
        Wine wine = (Wine) o;

        return Objects.equals(id, wine.id);
    }

    @Override
    public int hashCode() {
        return 255879828;
    }
}
