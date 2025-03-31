package javaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class simpleArrayList {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1 ; i<=5;i++){
            arr.add(input.nextInt());
        }
        System.out.println(arr);
    }
}
