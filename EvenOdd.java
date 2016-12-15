package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a number : ");

        int num = Integer.parseInt(br.readLine());

        if (num % 2 == 0){
            System.out.println("This number is even");
        }else {
            System.out.println("This number is odd");
        }
    }
}
