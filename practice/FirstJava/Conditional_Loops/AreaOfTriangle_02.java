package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

//formula=Area = (1/2) * base * height
public class AreaOfTriangle_02 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();
        float Area =(float) 0.5*base*height;
        System.out.printf("area of Triangle: %f",Area);
    }
}
