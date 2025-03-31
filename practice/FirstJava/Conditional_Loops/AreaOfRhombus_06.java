package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

public class AreaOfRhombus_06 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int d1 = input.nextInt();
        int d2= input.nextInt();
        float area =(d1*d2) *1/2;
        System.out.println(area);
    }
}
