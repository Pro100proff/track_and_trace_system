package com.example.trackandtracesystem.entities;

import java.time.LocalDate;

public class CompanyOrder implements Order {

    private Integer id;

    private LocalDate createdDate;

    private Client client;

    public CompanyOrder(Integer id, LocalDate createdDate, Client client) {
        this.id = id;
        this.createdDate = createdDate;
        this.client = client;
    }

    @Override
    public void printDocInfo() {
        System.out.println("Company : " + client.getInfo() + ", deliveryDate : " + createdDate.plusDays(2L));
    }
}
