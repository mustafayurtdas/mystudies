import java.util.Scanner;
import java.util.stream.IntStream;

public class UglyNumber {

    public static void main(String[] args) {

        isUgly();

    }

    private static void isUgly() {
        Scanner input = new Scanner(System.in);
        boolean isUgly = true;
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (int i = 7; i < number; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime){
                isUgly = number%i!=0;
                break;
            }

        }
        String message = isUgly ? number + " is Ugly": number + " is not Ugly";
        System.out.println(message);

    }

    public static boolean isPrime(int x){

        boolean isPrime = false;
        if (x>1){
            isPrime = IntStream.range(2,x).allMatch(t->x%t!=0);
        }
        return isPrime;

    }


}
