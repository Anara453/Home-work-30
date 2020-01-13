package com.company;

public interface Odejda {
     default void jacket() {
         System.out.println("Пальто размер 36 - 37");
     }
     default void wearJacket (){
         boolean isFeareble = true;
         if (isFeareble == true){
             System.out.println("Вы надели пальто");
         }
     }


}
