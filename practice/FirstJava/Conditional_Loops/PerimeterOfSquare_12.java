package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfSquare_12 {
    public static void main(String[] args) {
        // formula P=4a
        Scanner input  = new Scanner(System.in);
        int side = input.nextInt();
        int p =  4*side;
        System.out.println("Perimeter Of Square: "+p);
    }
}
