package javaMethod;
import java.util.Scanner;
public class firstMethod {
    public static void main() {
        System.out.println("sumOf run");
        sumOf();
        System.out.println("sumOf end");
        System.out.println();
        System.out.println("sumOf1 start");
        System.out.println(sumOf1());
        System.out.println("sumOf1 end");
    }
    static int sumOf1(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum=num1+num2;
        return sum;
    }
    static void sumOf(){
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int sum=num1+num2;
            System.out.println(sum);

    }

}
