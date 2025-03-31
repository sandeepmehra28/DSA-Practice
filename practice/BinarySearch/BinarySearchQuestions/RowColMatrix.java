package BinarySearch.BinarySearchQuestions;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 35;
         boolean ans = search(arr,target);
        System.out.println(ans);

    }
    static boolean search(int [] [] arr, int target){
        int row = 0;
        int col = arr.length-1;
      //  boolean ans = false;
        while(row<arr.length&&col>=0){
            if(target==arr[row][col]){
               // return new int []{row,col};
                return true;
            }
            if(arr[row][col]<target){
                 row++;
             }else {
                col--;
            }
        }
      //  return new int []{-1,-1};
       return false;
    }
}
