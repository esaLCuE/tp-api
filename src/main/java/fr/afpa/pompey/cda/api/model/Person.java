package fr.afpa.pompey.cda.api.model;
import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="Firstname")
    private String firstName;

    @Column(name="Lastname")
    private String lastName;

//
//    public String getFirstName() {
//        return this.firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return this.lastName;
//    }
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
}
