package com.company;

/**
 * Created by st on 14.01.2016.
 */
package com.company;

        import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] mas = new int[10];
        initMas(mas);
        printMas(mas);
        findMaxPair(mas);


    }


    public static void initMas(int[] fmas) {
        Random random = new Random();
        for (int i = 0; i < fmas.length; i++) {
            fmas[i] = random.nextInt(100);
        }
    }


    public static void printMas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            System.out.printf("%5d", fmas[i]);
        }
        System.out.println();

    }


// В массиве сравить попарно (1 со 2, 1 с 3, 1 с 4 и тд) элементы и найти те 2, сумма которых максимальная.

    public static void findMaxPair(int[] fmas) {
        if (fmas.length < 3) {
            System.out.println("mas.length dolzhen bit>2");
        }

        int sum = fmas[0] + fmas[1];
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas.length; j++) {
                if ((i != j) && (fmas[i] + fmas[j]) > sum) {
                    sum = fmas[i] + fmas[j];
                    max1 = i;
                    max2 = j;
                }
            }

        }
        System.out.println("i1 =" + max1 + "i2 =" + max2 + "sum = " + sum);

    }
}



