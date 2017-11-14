package com.luxoft.moviedatabase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String year;
    private String leadActor;
    private String supportingActor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getSupportingActor() {
        return supportingActor;
    }

    public void setSupportingActor(String supportingActor) {
        this.supportingActor = supportingActor;
    }
}
