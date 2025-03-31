package Questions.FirstJava.Conditional_Loops;
import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args) {
        //formula V=4
        //3πr3

       //double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        Scanner input   = new Scanner(System.in);
        int r = input.nextInt();
        float pr =(float) Math.pow(r,3);
        float ra =(float) Math.PI;
        double v  = (4.0/3.0)*ra*pr;
        System.out.println("ans: "+v);

    }
}