package Lecture_1;

import java.util.Scanner;

public class conditionalStatements {
    public static void main(String... args) {
        Scanner input = new  Scanner(System.in);
        char name = input.next().trim().charAt(4);
        System.out.println(name);
    }
}
