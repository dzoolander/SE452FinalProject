package edu.depaul.cdm.se.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AcademicQuarter {
    
    @Id
    private String id;
    private String year;
    private String session;

    public AcademicQuarter(String year, String session) {
        this.year = year;
        this.session = session;
        this.id = year + "_" + session;
    }

    public String getId() {
        return id;
    }

    public String getYear() {
        return year;
    }

    public String getSession() {
        return session;
    }

    @Override
    public String toString() {
        return "AcademicQuarter{" + "id=" + id + '}';
    }
    
    
    
}
