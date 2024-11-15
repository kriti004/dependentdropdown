package com.dependentdropdown.dependentdropdown.entities;

import jakarta.persistence.*;

@Entity
@Table(name="cities")
public class Cities {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "state_id")
    private int stateId;

    @Column(name = "country_id")
    private int country_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState_id() {
        return stateId;
    }

    public void setState_id(int state_id) {
        this.stateId = state_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public Cities(int id, String name, int state_id, int country_id) {
        this.id = id;
        this.name = name;
        this.stateId = state_id;
        this.country_id = country_id;
    }

    public Cities() {
    }

    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state_id='" + stateId + '\'' +
                ", country_id=" + country_id +
                '}';
    }

}
