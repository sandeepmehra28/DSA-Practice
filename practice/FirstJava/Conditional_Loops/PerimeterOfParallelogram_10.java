package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfParallelogram_10 {
    public static void main(String[] args) {
        // formula P=2(a+b)
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int s = input.nextInt();
        int p = 2*(s+b);
        System.out.println("Perimeter Of Parallelogram: "+p);
    }
}
