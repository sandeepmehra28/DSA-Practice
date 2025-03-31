package myThinking;

import java.util.Scanner;
class CheckCase{
    public static char Checker(char c){
        if(c>='a'&&c<='z'){
            System.out.println(c+" :is LowerCase");
        }else {
            System.out.println(c+" :is UpperCase");
        }
        return c;
    }
}

public class alphabetCaseCheck {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        char c = input.next().trim().charAt(0);
        CheckCase.Checker(c);

    }
}
