package com.sheygam.java_17_28_01_18;

/**
 * Created by gregorysheygam on 28/01/2018.
 */

public class Person {
    private String name, email;

    public Person() {
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
