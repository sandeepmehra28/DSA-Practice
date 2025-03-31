package javaArrays;

import utilityClass.ArrayClass;

import java.util.Arrays;
import java.util.Scanner;

public class myArr {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the row:");
        int row = input.nextInt();
        System.out.print("Enter the col:");
        int col  = input.nextInt();
        int [][] two_D_Arr= new int[row][col];

        for(int i = 0; i<two_D_Arr.length;i++){
            for(int j = 0;j<two_D_Arr[i].length;j++){
                two_D_Arr[i][j]=input.nextInt();
            }
        }
//        for(int i = 0; i<two_D_Arr.length;i++){
//            for(int j = 0;j<two_D_Arr[row].length;j++){
//                two_D_Arr[i][j]=input.nextInt();
//            }
//        }

        //use for-each loop
        for(int[] i:two_D_Arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //import utilityClass.ArrayClass;
       // ArrayClass.output2DArr(two_D_Arr);
    }
}
