package Lecture_1;
import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in);
        int n = input.nextInt();
        int a=0;
        int b =1;
        int count=2;
        while (count<=n){
            System.out.println("----------------------------");
            int temp = b;
            System.out.printf("int temp:%d = b%d;",temp,b);
            System.out.println();
            b+=a;
            System.out.printf("b+=a;(b:%d += a:%d)",b,a);
            System.out.println();
            a=temp;
            System.out.printf("a=temp;(a:%d = temp:%d) ",a,temp);
            System.out.println();
            count++;
            System.out.printf("count++: %d" ,count );
            System.out.println();
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("output:"+b);
        }
        System.out.println(b);
    }
}
