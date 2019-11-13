package edu.depaul.cdm.se.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Course {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String quarter;
    private Long instructorId;
    private String college;
    
    public Course(String quarter, Long id, String college) {
        this.quarter = quarter;
        this.instructorId = id;
        this.college = college;
    }

    public Long getId() {
        return id;
    }

    public String getQuarter() {
        return quarter;
    }

    public Long getInstructorId() {
        return instructorId;
    }

    public String getCollege() {
        return college;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", quarter=" + quarter + ", instructorId=" + instructorId + ", college=" + college + '}';
    }
    
    
    
}
