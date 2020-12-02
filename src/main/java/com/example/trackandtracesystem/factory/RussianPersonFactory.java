package com.example.trackandtracesystem.factory;

import com.example.trackandtracesystem.entities.Person;
import com.example.trackandtracesystem.entities.RussianPerson;

public class RussianPersonFactory implements PersonFactory {
    @Override
    public Person createPerson(Integer id, String name, String passportId, String gender) {
        return new RussianPerson(id, name, passportId, gender);
    }
}
