package javaArrays;

import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter number to find in this array: ");
        int x= input.nextInt();
        int [] arr = {10,15,20,15,14,15,15,6};
        for(int i = 0;i< arr.length;i++) {
            if (x == arr[i]) {
                System.out.println("your number fount at index: " + i);
            }
        }
    }
}
