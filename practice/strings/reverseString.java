package strings;

import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String userInput = input.nextLine();
        stringReverse(userInput);
    }

    public static void stringReverse(String name){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        int front;
        for (int i = 0; i < sb.length()/2; i++) {
             front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
