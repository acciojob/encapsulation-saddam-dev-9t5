package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("Saddam");
        String myName = obj.getName();
        System.out.println(myName);
    }
}