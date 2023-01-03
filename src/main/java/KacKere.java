package practice.bymyself;

import java.util.Scanner;

public class KacKere {
   /*   Kullanicidan bir cumle ve bir harf alin,
        Cumlede harfin kac kere kullanildigini bulup, yazdirin

        ORNEK:
        INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
        OUTPUT: Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("bir cümle girin:");
       String s = input.nextLine().toLowerCase();
       System.out.println("bir harf giriniz");
       char ch = input.next().toLowerCase().charAt(0);
       int sayac = 0;
       for (int i = 0; i <s.length() ; i++) {
           if (s.charAt(i)==ch){
               sayac++;
           }

       }
       System.out.println("Girdiğiniz cümlede \""+ch+"\" harfi "+ sayac+" kere kullanılmıştır.");

   }


}
