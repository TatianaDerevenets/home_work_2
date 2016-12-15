package com.hillel;

public class Residue {
  public static void main(String[] args)  {

        int a = 15;
        int b = 10;
        int residue;

        if (a % b != 0){
            residue = a % b;
            System.out.println("Residue = " + residue);
        } else {
            System.out.println("Divisible");
        }
  }
}
