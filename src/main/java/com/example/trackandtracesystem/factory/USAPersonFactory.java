package com.example.trackandtracesystem.factory;

import com.example.trackandtracesystem.entities.Person;
import com.example.trackandtracesystem.entities.USAPerson;

public class USAPersonFactory implements PersonFactory {
    @Override
    public Person createPerson(Integer id, String name, String passportId, String gender) {
        return new USAPerson(id, name, passportId, gender);
    }
}
