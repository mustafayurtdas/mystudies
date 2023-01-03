package practice.bymyself;

import java.util.Scanner;

public class AsalSayi {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve
    asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int num = input.nextInt();
        int t = 0;

        if (num > 1) {


            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    t++;
                }

            }
            if (t == 0) {
                System.out.println(num + " sayısı Asal Sayıdır.");
            } else {
                System.out.println(num + " sayısı Asal sayı değildir.");
            }
        } else if (num == 1) {
            System.out.println(" 1 sayısı Asal bir sayı değildir.");

        }else {
            System.out.println("lütfen pozitif bir sayı giriniz.");
        }
    }

}
