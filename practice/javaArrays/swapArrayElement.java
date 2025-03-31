package javaArrays;

import java.util.Arrays;
import java.util.Scanner;
class FunctionalClass{
    static void swap(int[] arr,int index1,int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
public class swapArrayElement {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){array[i]= input.nextInt();}
        System.out.println("Enter the index to swap: ");
        System.out.print("first index :");
        int firstIndex= input.nextInt();
        System.out.print("Enter second index: ");
        int secondIndex = input.nextInt();
        FunctionalClass.swap(array,firstIndex,secondIndex);
        System.out.println(Arrays.toString(array));
    }

}
