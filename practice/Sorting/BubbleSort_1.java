package Sorting;

import java.util.Arrays;

public class BubbleSort_1 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,2,5,7,3,2,6,7,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
