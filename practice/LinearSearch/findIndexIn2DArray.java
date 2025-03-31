package LinearSearch;

import java.util.Arrays;

public class findIndexIn2DArray {
    public static void main(String[] args) {
     int [][] arr= {
            {11,22,33},
            {44,55,1001},
            {66,88,9},
        };
     int target = 88;
     int [] ans = findIndex(arr,target);
        System.out.println("index will be found in:"+Arrays.toString(ans));
        System.out.println("this is the maximum value:"+maxVal(arr));
        System.out.println("this is the minimum value:"+minVal(arr));
    }
    static int[] findIndex(int[] [] arr,int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0;col< arr[row].length;col++){
                    if(arr[row][col]==target){
                        return new int[] {row,col};
                    }
            }

        }
        return new int[]{-1,-1};
    }
    static int minVal(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int[] i:arr) {
           for (int j:i){
               if(j<min){
                   min=j;
               }
           }
        }
        return min;
    }
    static int maxVal(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] i:arr) {
            for (int j:i){
                if(j>max){
                    max=j;
                }
            }
        }
        return max;
    }
}
