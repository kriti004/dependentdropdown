package com.dependentdropdown.dependentdropdown.entities;

import jakarta.persistence.*;

    @Entity
    @Table(name="states")
    public class States {

        @Id
        @GeneratedValue
        @Column(name = "id")
        private int id;

        @Column(name="name")
        private String name;

        @Column(name="country_id")
        private int countryId;

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

        public Integer getCountryId() {
            return countryId;
        }

        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }

        public States(int id, String name, int countryId) {
            this.id = id;
            this.name = name;
            this.countryId = countryId;
        }

        public States() {
        }

        @Override
        public String toString() {
            return "States{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", country_id='" + countryId + '\'' +
                    '}';
        }

    }


