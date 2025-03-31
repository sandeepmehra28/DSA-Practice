package Lecture_1;

import java.util.Scanner;

public class typeCasting extends  Thread{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
       // int num = (int)input.nextFloat();//type casting: convert float number into the integer
        // System.out.println(num);

        //float number = (float) input.nextDouble();//type casting: convert double number into the float
        //System.out.println(number);

        //byte num1 = (byte) input.nextInt();//type casting: convert integer into byte
        //System.out.println(num1);

         //int a = 257;
        // byte b = (byte) a;
        //System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;
//        System.out.println(d);

        // important
        byte b =42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i / c) - (d*s);
        /*:auto cast in java
         note: double result = (f*b)+(i / c) - (d*s);
         (f*b): float is greater than byte, so a result is converting into float ;
         (i / c): int is greater than char, so a result is converting into int ;
         (d*s): double is greater than short, so a result is converting into double;
         */
        // float + int - double = double ;
        System.out.println((f*b)+"  "+(i / c) +"  "+ (d*s));
        System.out.println(result);
    }
}
