package Sorting;

import java.util.Arrays;

public class sort_InASC_DEC_Order {
    public static void main(String[] args) {
        int [] arr = {1,2,4,2,5,7,3,2,6,7,3};
        System.out.println("your main array is: "+ Arrays.toString(arr));
        int[] newArr_1 = bubbleSortASC(arr);
        System.out.println("sorting array in ASC order: "+Arrays.toString(newArr_1));
        int[] newArr_2 = bubbleSortDES(arr);
        System.out.println("sorting array in DES order"+Arrays.toString(newArr_2));
    }
    static int[] bubbleSortASC(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }return arr;
    }
    static int[] bubbleSortDES(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
