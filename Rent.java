package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rent {
    public static void main(String[] args) throws IOException {

        int value = 40;
        System.out.println("How many days would you like to stay?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(br.readLine());

        if (days <= 5) {
            int rent = value * days;
            System.out.println("Rent is " + rent);
        }
        if (days <= 7 && days > 5) {
            int rent = value * days - 20;
            System.out.println("Rent is " + rent);
        }else{
            int rent = value * days - 50;
            System.out.println("Rent is " + rent);
        }
    }
}
