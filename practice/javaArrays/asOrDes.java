package javaArrays;

import java.util.Scanner;

public class asOrDes {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }
        boolean isAs = true;
        for(int i = 0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAs= false;
            }
        }
        if(isAs){
            System.out.println("your array is ascending order");
        }else {
            System.out.println("your array is descending order");
        }
    }
}
