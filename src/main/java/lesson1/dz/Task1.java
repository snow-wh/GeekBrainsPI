package lesson1.dz;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

    }


    /**
     * В заданном интервале найти наибольшее число, которое делится
     * на сумму цифр этого числа
     *
     *
     * aaabbbssskkk
     * a3b3s3k3
     *
     *
     *
     */

    public static int num(int min, int max) {
        
        int result =0 ;
        for (int i = min; i < max; i++) {

            int bufNum = i;
            int count = 0;
            while (bufNum > 0) {

                count += bufNum % 10;
                bufNum /= 10;

            }

            if (i % count == 0){
                System.out.println(i);
                result = i;
            }


        }

        return result;
    }

}
