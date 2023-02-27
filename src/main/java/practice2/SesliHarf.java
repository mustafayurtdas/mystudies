package practice2;

import java.util.Scanner;

public class SesliHarf {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
           değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u
    Test Data: a
    Beklenen Çıktı: a harfi sesli harfdir.
    Test Data: d
    Beklenen Çıktı: d harfi sesiz harftir.
    Test Data: w  yada %
    Beklenen Çıktı: Yanlis karakter girdiniz!
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Harf Giriniz:");
        char ch = input.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a': case 'e': case 'i': case 'u': case 'o':
                System.out.println(ch+" harfi sesli harftir.");
        }

    }
}
