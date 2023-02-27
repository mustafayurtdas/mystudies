package practice2;

import java.util.Scanner;

public class BirSayiylaCarpma {
    // belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = input.nextInt();

        for (int i = 1; i <11 ; i++) {
            System.out.println(num +" x "+i+" = "+(i*num));
        }
    }
}
