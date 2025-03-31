package Questions.FirstJava;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class GreetingM {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = input.next().trim().toUpperCase();
        System.out.printf("good morning %s \n",userName);
        System.out.printf("Welcome to my DSA course %s. \nI hope you improve your skill after this course",userName);
    }
}
