package utilityClass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

   public static void inputIntegerArray(int num){
        Scanner input  = new Scanner(System.in);
        int [] arr = new int[num];
        for(int i= 0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

    }
    public static void outputIntegerArray(int[] num){
       //using simple for loop
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }

        //using for-each loop
//        for(int i:num){
//            System.out.print(i+" ");
//        }

        //using Array toString method
        System.out.println(Arrays.toString(num));
    }

   public static void input2DArr(int row,int col){
       Scanner input = new Scanner(System.in);
       int [][] arr = new int[row][col];
       for(int r=0;r< arr.length;r++){
           for(int c=0;c<arr[r].length;c++){
               arr[r][c] = input.nextInt();
           }
       }
    }
   public static void output2DArr(int[][] arr){
       for(int row=0;row< arr.length;row++){
           for(int col = 0;col<arr[row].length;col++){
               System.out.print(arr[row][col]+" ");
           }
           System.out.println();
       }
    }
}
