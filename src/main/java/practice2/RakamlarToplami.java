package practice2;

import java.util.Scanner;

public class RakamlarToplami {
    // Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = input.nextInt();

        int sum = 0;

        for (int i = num; i > 0 ; i/=10) {
            sum += i%10;
        }
        System.out.println(num + " sayısının rakamları toplamı = "+sum);

    }

}
