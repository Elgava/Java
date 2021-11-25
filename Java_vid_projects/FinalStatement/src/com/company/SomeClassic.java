package com.company;

public class SomeClassic {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;


    public SomeClassic(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}