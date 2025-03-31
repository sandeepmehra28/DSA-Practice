package Questions.FirstJava.Conditional_Loops;
import java.util.Scanner;
//Area Of Rectangle Program
public class AreaOfRec_03 {
      public static void main(String[] args) {
            Scanner input =  new Scanner(System.in);
            System.out.print("Enter your length: ");
            int len = input.nextInt();
            System.out.print("Enter your width: ");
            int wid = input.nextInt();
            float Area = len*wid;
            System.out.printf("Area of Rectangle: "+Area);
      }
}
