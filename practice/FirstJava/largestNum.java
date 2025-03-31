package Questions.FirstJava;
//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class largestNum {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println("first number grater than second number..");
        }else{
            System.out.println("second number grater then first number..");
        }
    }
}
