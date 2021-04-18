package com.joeamerson;

// TODO: here will measure my age  by put the year of birth
// every thing here is private and we can deal with it by set and get
public class AgeMeasure {
    private byte yearBirth ;
    private static int Age;


    // it is mean we don't need them make new object to call it ,
    public static void setAge(int yearBirth) {
        Age = 2021- yearBirth ;
    }

    public int getAge() {
        return Age;
    }



}
