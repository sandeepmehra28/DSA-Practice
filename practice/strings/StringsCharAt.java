package strings;

import java.util.Scanner;

public class StringsCharAt {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String name = input.next().trim();
        String lName = input.next().trim();
        String out = name+" "+lName;
        System.out.println(out);
        char o = ' ';
        for (int i = 0; i < out.length(); i++) {
            System.out.print(out.charAt(i));
            if(out.charAt(i)==o){
                System.out.print("yes your String is carry a space");
            }
        }
    }
}
