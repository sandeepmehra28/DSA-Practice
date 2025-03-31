package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

public class AreaOfParallelogram_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter baseOfParallelogram: ");
        int b = input.nextInt();
        System.out.print("Enter heightOfParallelogram: ");
        int h = input.nextInt();
        int area = b*h;
        System.out.println("Area of Parallelogram: "+area);
    }
}
