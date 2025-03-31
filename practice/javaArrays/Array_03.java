package javaArrays;
import java.util.Scanner;
import utilityClass.ArrayClass;
public class Array_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0;i< arr.length;i++) {
            arr[i]= input.nextInt();
        }
        ArrayClass.outputIntegerArray(arr);
/*
        for(int i = 0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        for (int i:arr){//using for-Each loop
            System.out.print(" "+i);
        }
*/
        //System.out.println(Arrays.toString(arr));

    }
}
