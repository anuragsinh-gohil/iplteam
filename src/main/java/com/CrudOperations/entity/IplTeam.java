package com.CrudOperations.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "iplteams")
public class IplTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int trophies;
    private String captainName;

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IplTeam() {
    }

    public IplTeam(int trophies, int id, String name, String captainName) {
        this.trophies = trophies;
        this.id = id;
        this.name = name;
        this.captainName = captainName;
    }
}
