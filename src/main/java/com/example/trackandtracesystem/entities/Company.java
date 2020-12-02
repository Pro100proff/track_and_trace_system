package com.example.trackandtracesystem.entities;

public class Company implements Client {

    private Integer id;

    private String name;

    private String inn;

    public Company(Integer id, String name, String inn) {
        this.id = id;
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String getInfo() {
        return "Company : " + name + ", INN: " + inn;
    }
}
