package practice2;

import java.util.Scanner;

public class ElmasSekli {
    /*
     5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Uzunluk giriniz:");
        int uzunluk = input.nextInt();

        for (int i = 1; i < uzunluk + 1; i++) {
            for (int j = i; j < uzunluk + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < uzunluk; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = i*2; j < uzunluk * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
