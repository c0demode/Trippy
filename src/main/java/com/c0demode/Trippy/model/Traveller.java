package com.c0demode.Trippy.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "traveller")
public class Traveller {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Getter
    @Setter
    @Column(name="fname")
    private String fName;
    @Getter
    @Setter
    @Column(name="lname")
    private String lName;
    @Getter
    @Setter
    @Column(name="email")
    private String email;

    public Traveller(String fName, String lName, String email) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public Traveller() {
    }
}
