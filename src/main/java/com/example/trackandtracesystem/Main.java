package com.example.trackandtracesystem;

import com.example.trackandtracesystem.factory.RussianPersonFactory;
import com.example.trackandtracesystem.service.AbstractOrderService;
import com.example.trackandtracesystem.service.PersonOrderService;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
        Prototype prototype = new Prototype("123");
        System.out.println("base object = " + prototype);
        Object clone = prototype.clone();
        System.out.println("clone object = " + clone);

        prototype.setName("Dimon");
        System.out.println("clone object  name = " + ((Prototype)clone).getName());
        System.out.println("prototype name = " + prototype.getName());
    }

}
