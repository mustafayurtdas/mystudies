package practice;

import java.util.Scanner;

public class FirstAndLastLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String str = input.nextLine().toLowerCase();

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        String ch = "" + first + last;

        System.out.println("lütfen bir sayı giriniz");
        int num = input.nextInt();
        myMethod(ch,num);

    }
    static void myMethod(String a, int b) {
        String s = "";
        for (int i = 0; i < b; i++) {
               s+=a;
        }
        System.out.println(s);
    }

}







