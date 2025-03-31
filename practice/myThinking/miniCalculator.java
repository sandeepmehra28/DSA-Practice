package myThinking;

import java.util.Scanner;

public class miniCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple calculator");
        int ans =0;
        while (true){
            System.out.println("Please select the operations [ + , - , / , % ]");
            char ch = input.next().trim().charAt(0);
            if(ch=='+'||ch=='-'||ch=='/'||ch=='%'){
                System.out.print("Enter your first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter your second number: ");
                int num2 = input.nextInt();
                if(ch=='+'){
                    ans = num1+num2;
                }
                if(ch=='-'){
                    ans = num1-num2;
                }
                if(ch=='/'){
                    if(num1 != 0 && num2!=0){
                        ans = num1/num2;
                    }else {
                        System.out.println("number [0] is not valid");
                    }
                }
                if(ch=='%'){
                    ans = num1%num2;
                }
            } else if (ch=='X' || ch=='x') {
                break;
            }else{
                System.out.println("Invalid operation retry");
            }
            System.out.println(ans);
        }

    }
}
