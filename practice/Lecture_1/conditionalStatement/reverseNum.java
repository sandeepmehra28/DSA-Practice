package Lecture_1.conditionalStatement;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int userInput = input.nextInt();
        int ans =0;
        while (userInput>0){
            int rem = userInput%10;
            userInput = userInput/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
