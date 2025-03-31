package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

//Area Of Circle Java Program
public class AreaOfCircle_01 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        float redius = input.nextFloat();
        float PI =(float) Math.PI;
        float Area = PI*redius*redius;
        System.out.println("Area of circle: "+Area);
    }
}
