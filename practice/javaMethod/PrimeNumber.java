package javaMethod;
import java.util.Scanner;
import static utilityClass.Prime.isPrime;
public class PrimeNumber{
    public static void main(String... args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        boolean ans = isPrime(number);
        System.out.println(ans);
    }

}
