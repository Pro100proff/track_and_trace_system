package com.example.trackandtracesystem.entities;

public class RussianPerson  implements Person{
    private Integer id;
    private String name;
    private String passportId;
    private String gender;

    public RussianPerson(Integer id, String name, String passportId, String gender) {
        this.id = id;
        this.name = name;
        this.passportId = passportId;
        this.gender = gender;
    }

    @Override
    public String getInfo() {
        return "Клиент: " + name + ", паспорт: " + passportId;
    }
}
