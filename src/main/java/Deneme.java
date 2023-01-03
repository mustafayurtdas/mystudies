package practice.bymyself;

import java.util.Scanner;

public class Deneme {
    /*

     *
     * *
     *   *
     *     *
     * * * * *
       */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else if (i == row) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }


            }
            System.out.println();

        }


    }


}
