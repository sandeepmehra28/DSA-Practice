package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle_09 {
    public static void main(String[] args) {
        //formula P=3a
        Scanner input= new Scanner(System.in);
        int side = input.nextInt();
         int parameter = 3*side;
        System.out.println(parameter);
    }
}
