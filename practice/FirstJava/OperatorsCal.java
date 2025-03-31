package Questions.FirstJava;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)
public class OperatorsCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Operations [+ , - , * , / , %]");
        char number = input.next().charAt(0);
        if(number=='+'||number=='-'||number=='*'||number=='/'||number=='%'){
            System.out.print("Enter your first digit: ");
            int num1 = input.nextInt();
            System.out.print("Enter your second digit: ");
            int num2 = input.nextInt();
            int result = 0;
            if(number=='+'){
               result=num1+num2;
            }
            if(number=='-'){
                result=num1-num2;
            }
            if (number=='*'){
                result=num1*num2;
            }
            if (num2!=0){
                if(number=='/'){
                    result=num1/num2;
                }
            }else {
                System.out.println("/ by zero not allow...");
            }
            if(number=='%'){
                result=num1%num2;
            }
            System.out.println(result);
        }else {
            System.out.println("please select right operation..!");
        }


    }
}
