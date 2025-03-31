package Questions.FirstJava;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter your Principle: ");
        int p  = input.nextInt();
        System.out.print("Enter your Time: ");
        int t = input.nextInt();
        System.out.print("Enter rate: ");
        int r  = input.nextInt();
        int simpleInt = (p*t*r)/100;
        System.out.println(simpleInt);
    }
}
