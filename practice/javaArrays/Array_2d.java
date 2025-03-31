package javaArrays;
import java.util.Scanner;
import utilityClass.ArrayClass;
public class Array_2d {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int [] [] arr = new int[3][3];
        //input the 2d array
        //to rows
        for(int rows = 0;rows<arr.length;rows++){
            //cols
            for(int cols = 0;cols<arr[rows].length;cols++){
                arr[rows][cols]=input.nextInt();
            }
        }
        //output the 2d array
//        for(int row = 0;row< arr.length;row++){
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]);
//            }
//        }
         ArrayClass.output2DArr(arr);
    }
}
