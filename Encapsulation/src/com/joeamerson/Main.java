package com.joeamerson;
//It describes the idea of bundling data and methods that work on that data within one unit

public class Main {

    public static void main(String[] args) {
       AgeMeasure.setAge(2000);
       var myAge = new AgeMeasure();
       int age = myAge.getAge();
        System.out.println("Your Age is "+ age);

    }


}
