package javaMethod;

import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
//        int value = input.nextInt();
//        boolean out= armStrong(value);
//        System.out.println(out);
        for (int i = 10; i < 10000; i++) {
            if(armStrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean armStrong(int number){
        int orignal = number;
        int sum=0;
        while(number>0){
            int rem = number%10;
            number=number/10;
            sum=sum+rem*rem*rem;
        }
        return sum==orignal;
    }
}
