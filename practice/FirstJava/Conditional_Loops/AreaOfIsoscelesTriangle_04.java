package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

//Area of an Isosceles Triangle
public class AreaOfIsoscelesTriangle_04 {
    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in);
        int base  = input.nextInt();
        int height = input.nextInt();
        float Area =(float) 0.5*base*height;
        System.out.println("Area of an Isosceles Triangle: "+Area);
    }
}
