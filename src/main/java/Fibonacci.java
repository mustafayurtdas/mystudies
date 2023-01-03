package practice.bymyself;

import java.util.Scanner;

public class Fibonacci {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(b);

        for (int i = 1; i < num; i++) {

            int c = a + b;
            System.out.print(" - " + c);
            a = b;
            b = c;


        }

    }
}
