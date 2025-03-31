package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfCircle_08 {
    public static void main(String[] args) {
        //C=2πr
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = input.nextByte();
        float pi =(float) Math.PI;
        float poc =(float) 2*pi*r;
        System.out.println("Perimeter Of Circle: "+poc);
    }
}
