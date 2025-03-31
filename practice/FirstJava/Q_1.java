package Questions.FirstJava;
import java.util.Scanner;
// Write a program to print whether a number is even or odd, also take
//input from the user.
public class Q_1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int number= input.nextInt();
        if(isEvenOrOdd(number)==true){
            System.out.println("Even");
        }
        else {
            System.out.println("False");
        }
    }
    static boolean isEvenOrOdd(int number){
        if(number%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
