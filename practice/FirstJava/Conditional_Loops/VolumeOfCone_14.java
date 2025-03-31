package Questions.FirstJava.Conditional_Loops;

import java.util.Scanner;

public class VolumeOfCone_14 {
    public static void main(String[] args) {
        // formula V=πr2h/3
        Scanner input  = new Scanner(System.in);
        float pi =(float) Math.PI;
        System.out.print("Enter radius: ");
        int r = input.nextInt();
        System.out.print("Enter height: ");
        int  h = input.nextInt();
//        float value =( pi*(r*r))*(h/3);
        float v1 = pi*(r*r);
        float v2 = (v1*h/3);
        System.out.println("Volume Of Cone Java Program: "+v2);
    }
}
