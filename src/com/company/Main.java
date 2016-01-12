package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 5;

        System.out.println(factorial(i));

    }


    public static int factorial(int a) {
        if (a == 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }



    public static boolean prostoe(int a){
        for (int i = 2; i<a; i++){
            if (a % i ==0){
                return false;
            }
        }

        return true;
    }

}



