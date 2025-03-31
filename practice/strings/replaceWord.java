package strings;

import java.util.Scanner;

public class replaceWord {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String name = input.next();
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='a'){
                result+='i';
            }else {
                result+=name.charAt(i);
            }
        }
        System.out.println(result);
    }
}
