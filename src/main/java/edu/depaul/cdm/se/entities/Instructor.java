package edu.depaul.cdm.se.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instructor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String college;
    
    public Instructor(String firstName, String lastName, String college) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.college = college;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName () {
        return lastName;
    }
    
    public String getCollege () {
        return college;
    }
    
    public String toString() {
        return String.format("Instructor [id=%d, firstName='%s', lastName='%s', colleg='%s']",
                id, firstName, lastName, college);
    }
    
}
