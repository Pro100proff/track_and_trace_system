package com.example.trackandtracesystem;

public class Prototype implements Cloneable{
    private String name;

    private Integer id;

    public Prototype(String name) {
        this.name = name;
    }

    public Prototype(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Prototype(name, id);
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                '}';
    }
}
