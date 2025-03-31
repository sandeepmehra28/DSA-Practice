package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfRectangle_11 {
    public static void main(String[] args) {
        //formula P=2(l+w)
        Scanner input  = new Scanner(System.in);
        int l = input.nextInt();
        int w = input.nextInt();
        int p = 2*(l+w);
        System.out.println("Perimeter Of Rectangle: "+p);
    }
}
