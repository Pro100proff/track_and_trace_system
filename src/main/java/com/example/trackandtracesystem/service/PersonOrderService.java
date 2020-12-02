package com.example.trackandtracesystem.service;

import com.example.trackandtracesystem.entities.Order;
import com.example.trackandtracesystem.entities.PersonOrder;
import com.example.trackandtracesystem.factory.PersonFactory;

import java.time.LocalDate;

public class PersonOrderService extends AbstractOrderService{

    private PersonFactory factory;

    public PersonOrderService(PersonFactory factory) {
        this.factory = factory;
    }

    @Override
    protected Order createClientOrder() {
        return new PersonOrder(12, LocalDate.now(), factory.createPerson(12, "Name", "123", "мужик") );
    }
}
