package javaArrays;
import java.util.Arrays;
public class swapWithReverse {
    public static void main(String[] args) {
        int [] array = {1,2,3,55,6,7};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    static void reverse(int[]arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
