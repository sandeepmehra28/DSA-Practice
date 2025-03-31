package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

public class AreaOfEquilateralTriangle_07 {
    public static void main(String[] args) {
        //Area of equilateral triangle = √3/4 × (side)2
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        float area =(float) Math.sqrt(3)/4*(side*side);
        System.out.println(area);
    }
}

