package com.company;

public interface Eateble  {
    default void eateble(){
        System.out.println("Cвежая еда только для вас");
        boolean isEtable = true;

    }
}
