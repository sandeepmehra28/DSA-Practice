package javaArrays;
import java.util.Scanner;
class useArray{
    //find number method
    public static boolean findNumberInArray(int[] arr,int find){
       for (int i :arr){
           if(arr[i]==find){
               return true;
           }
           System.out.println();
       }return false;
    }
    //initialise array
    public static  int[] printAr(int size){
    Scanner input = new Scanner(System.in);
        int [] arr = new int[size];
        for (int i :arr) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
public class findElement {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter size: ");
        int size= input.nextInt();
        int [] arr = useArray.printAr(size);
        System.out.print("Enter number to find: ");
        int x = input.nextInt();
        if(useArray.findNumberInArray(arr,x)){
            System.out.print("yes your number is in this array");
        }else {
            System.out.print("no your number is not in this array");
        }
    }
}
