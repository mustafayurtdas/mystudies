package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
    public static void main(String[] args) {
        System.out.println("************* Mükemmel Sayi *****************");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Çıkış İçin 'negatif'(-) değer giriniz. \nBir sayı giriniz");
            int num = scan.nextInt();
            if (num < 0) {
                break;
            } else {
                int sum = 0;
                for (int i = 1; i < num; i++) {

                    if (num % i == 0) {
                        sum += i;
                    }
                }
                if (sum == num) {
                    System.out.println(num + " sayısı Mükemmel bir sayıdır.");
                }else {
                    System.out.println(num + " sayısı Mükemmel bir sayı Değildir!..");
                }

            }
        }

    }
}
