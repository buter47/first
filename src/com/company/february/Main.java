package com.company.february;

public class Main {

    public static void main(String[] args) {
        int[][] m;

        m=initMas();
        printMas(m);
        //  domashka ¹7 chast'

    }

    public static int[][] initMas() {
        int[][] m = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                m[i][j] = (i + 2) * (j + 2);

            }
        }return m;
    }


    public static void printMas(int[][] m) {
        System.out.printf(" ");
        for (int i =0; i<8; i++){
            System.out.printf("");
        }
        System.out.println();
        System.out.println("---------------");

        for(int i=0; i<8; i++){
            System.out.print(i+2 +"|");
            for (int j=0; j<2; j++){
                System.out.printf("%5d");
            }
            System.out.println();
        }

    }


}