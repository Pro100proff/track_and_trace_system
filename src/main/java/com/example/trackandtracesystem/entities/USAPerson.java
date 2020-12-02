package com.example.trackandtracesystem.entities;

public class USAPerson implements Person {
    private Integer id;
    private String name;
    private String passportId;
    private String gender;

    public USAPerson(Integer id, String name, String passportId, String gender) {
        this.id = id;
        this.name = name;
        this.passportId = passportId;
        this.gender = gender;
    }

    @Override
    public String getInfo() {
        return "Client : " + name + ", passportId: " + passportId + ", gender:" + gender;
    }
}
