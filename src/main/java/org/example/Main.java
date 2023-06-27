package org.example;

import org.example.Adaptar.ICICIBankAdaptar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PhonePe pp = new PhonePe(new ICICIBankAdaptar());
    }
}