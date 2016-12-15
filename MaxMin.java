package com.hillel;

public class MaxMin {
    public static void main(String[] args) {
        int a = 17;
        int b = 9;
        int c = 44;

        int max;
        if (a > b){
            if (a > c) {
                max = a;
            }else{
                max = c;
            }
        }else{
            if (b > c){
                max = b;
            }else{
                max = c;
            }
        }
        System.out.println("max = " + max);


        int min;
        if (a < b){
            if (a < c) {
                min = a;
            }else{
                min = c;
            }
        }else{
            if (b < c){
                min = b;
            }else{
                min = c;
            }
        }
        System.out.println("min = " + min);
    }
}
