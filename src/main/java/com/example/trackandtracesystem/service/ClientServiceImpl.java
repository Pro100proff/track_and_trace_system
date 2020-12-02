package com.example.trackandtracesystem.service;

import com.example.trackandtracesystem.entities.Person;
import com.example.trackandtracesystem.factory.PersonFactory;
import com.example.trackandtracesystem.factory.RussianPersonFactory;
import com.example.trackandtracesystem.factory.USAPersonFactory;

public class ClientServiceImpl implements ClientService {

    private PersonFactory factory;

    public ClientServiceImpl(PersonFactory factory) {
        this.factory = factory;
    }

    @Override
    public String showClientInfo() {
        Person person = factory.createPerson(12, "Ивано Иван", "9999 123456", "мужик");
        return person.getInfo();
    }

    public static void main(String[] args) {
        ClientService clientService = new ClientServiceImpl(new USAPersonFactory());
        System.out.println(clientService.showClientInfo());
    }
}
