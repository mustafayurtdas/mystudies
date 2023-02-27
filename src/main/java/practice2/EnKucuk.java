package practice2;

public class EnKucuk {
    // uc sayi arasinda en kucugu bul
    public static void main(String[] args) {
        int a = 12;
        int b= 23;
        int c = 34;

        enkucuk(a,b,c);
    }
    private static void enkucuk(int a,int b,int c) {
        int minumum = Math.min(Math.min(a,b),c);
        System.out.println(minumum);
    }
}


/*
public class Test {


        }
 */
