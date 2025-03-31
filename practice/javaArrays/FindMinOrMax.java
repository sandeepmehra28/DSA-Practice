package javaArrays;

import java.util.Scanner;

public class FindMinOrMax {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int []  arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest number is : "+max);
        System.out.println("minimum number is : "+min);
    }
}
