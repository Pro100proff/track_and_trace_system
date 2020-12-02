package com.example.trackandtracesystem.entities;

import java.time.LocalDate;

public class PersonOrder implements Order {

    private Integer id;

    private LocalDate createdDate;

    private Client client;

    public PersonOrder(Integer id, LocalDate createdDate, Client client) {
        this.id = id;
        this.createdDate = createdDate;
        this.client = client;
    }

    @Override
    public void printDocInfo() {
        System.out.println("Физ. лицо :" + client.getInfo() + ", дата отправки : " + createdDate);
    }
}
