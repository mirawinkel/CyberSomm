package com.reflectionwebdesign.cybersomm.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
public @Getter
@Setter
@Table(name="wine")
@SecondaryTable(name="user_favorites", pkJoinColumns = @PrimaryKeyJoinColumn(name = "favorites_id"))
@SecondaryTable(name="wine_descriptor", pkJoinColumns = @PrimaryKeyJoinColumn(name = "wine_id"))
class Wine implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @PrimaryKeyJoinColumn
    private long id;

    @Column
    protected String name;

    @Column
    protected String producer;

    @Column
    protected String vintage;

    @Column
    protected String varietal;

    @Column
    protected String region;

    @Column
    protected String country;

    @Column
    @ElementCollection
    protected Set<String> descriptor;

    @Column
    protected double cost;

    @Column
    protected double price;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name="vendor_wine_list",
            joinColumns = @JoinColumn(name = "wine_id"),
            inverseJoinColumns = @JoinColumn(name = "vendor_id")
    )
    Set<Vendor> vendors;

    public Wine() {
        this.descriptor = new HashSet<>();
        this.vendors = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "producer = " + producer + ", " +
                "vintage = " + vintage + ", " +
                "varietal = " + varietal + ", " +
                "appellation = " + region + ", " +
                "country = " + country + ", " +
                "descriptor = " + descriptor + ", " +
                "price = " + price + ")";
    }
}
