package Lecture_1;

import java.util.Scanner;

public class Class_01 {
    public static void main(String[] args)  {
        Scanner input  = new Scanner(System.in);
        //understand how memory work during declairation
/*
       int a = 10;//a: a is a reference variable and 10: 10 is an object
                   // a: store in the stack memory and 10: is store in the heap memory
        System.out.println(a);
*/


      //add bouns-----------------------------------
        /*
        int employeSalary = input.nextInt();
        if(employeSalary>10000){
            System.out.println(employeSalary+=1000);
        }else {
            System.out.println(employeSalary+=2000);
        }*/

        // number is prime or not prime--------------
        /*
         int number = input.nextInt();
         int  count = 2;
         while(count<number){
             if(number%count==0){
                 System.out.println("your number is not prime");
             }
             count=count+1;
         }
        System.out.println("your number is prime");
         */

        //neither prime nor composite
        //if (n <= 1) {
        //            System.out.println("Neither prime nor composite");
        //        } else {
        //            boolean isPrime = true;
        //            for (int c = 2; c * c <= n; c++) {
        //                if (n % c == 0) {
        //                    isPrime = false;
        //                    break;
        //                }
        //            }
        //
        //            if (isPrime) {
        //                System.out.println(n + " is prime");
        //            } else {
        //                System.out.println(n + " is not prime");
        //            }
        //        }
        //    }
        //}
        int n = input.nextInt();
        if(n<=1) {
            System.out.println("neither prime nor composite");
        }else {
            int c = 2;
            while (c * c <= n) {
                if (n % c == 0) {
                    System.out.println("not prime"+c+n);
                }
                c += 1;
            }
            System.out.println("prime");
        }
    }
}
