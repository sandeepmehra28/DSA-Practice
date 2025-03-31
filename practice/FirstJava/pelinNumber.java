package Questions.FirstJava;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class pelinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int num = input.nextInt();
        while(num>0){
            int temp = num%10;
            int mul = temp/10;
             sum = sum+mul;
            System.out.println(sum);
        }

    }
}
