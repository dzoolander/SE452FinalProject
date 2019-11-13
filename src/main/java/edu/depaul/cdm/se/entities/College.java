package edu.depaul.cdm.se.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
    
    @Id
    private String collegeName;
    private String description;

    public College(String collegeName, String description) {
        this.collegeName = collegeName;
        this.description = description;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "College{" + "collegeName=" + collegeName + ", description=" + description + '}';
    }
    
    
    
}
