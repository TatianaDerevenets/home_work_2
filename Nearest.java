package com.hillel;

public class Nearest {
    public static void main(String[] args) {

        int a = 7;
        int b = 15;

        int a1 = Math.abs(10 - a);
        int b1 = Math.abs(10 - b);

        if (a1 == b1){
            System.out.println("Equidistant");
        }

        if (a1 > b1){
            System.out.println(b + " nearest to 10");
        }

        if (a1 < b1){
            System.out.println(a + " nearest to 10");
        }
    }
}
