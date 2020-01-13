package com.company;

public interface Drink {
    default void drink() {
        System.out.println("Питьевая вода");
        boolean isDrinkable = true;
    }
}
