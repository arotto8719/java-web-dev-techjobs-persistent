package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Scanner;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @OneToMany(mappedBy = "employer")

    private final List<Job> jobs = new ArrayList<>();


    public Employer() {
    }


    public Employer(String location) {

        this.location = location;
    }

    @Size(min=2, max=100, message = "Employer only has one location")
    private String location;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    @Override
//    public String toString() {
//        return name;
//    }


}
