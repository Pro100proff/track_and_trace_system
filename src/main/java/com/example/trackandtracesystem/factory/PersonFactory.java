package com.example.trackandtracesystem.factory;

import com.example.trackandtracesystem.entities.Person;

public interface PersonFactory {
    Person createPerson(Integer id, String name, String passportId, String gender);
}
