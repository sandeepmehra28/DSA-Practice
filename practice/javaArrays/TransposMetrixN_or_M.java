package javaArrays;

import java.util.Scanner;

public class TransposMetrixN_or_M {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int [] [] arr = new int[n][m];
        for(int i = 0;i<n;i++){
            for (int j = 0; j <m ; j++) {
                arr[i][j]= input.nextInt();
            }
        }
        for (int j = 0; j <m ; j++) {
            for(int i = 0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
