package myThinking;
import java.util.Scanner;
public class find_ASCII {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println(" alphabet into ASCII value");
        System.out.print("note!  choose between 'a' & 'A' : ");
        char ch = input.next().charAt(0);
       /*
         char aa = 'a';
        char bb = 'A';
        */
        if(Character.toLowerCase(ch) == 'a' && Character.toUpperCase(ch) == 'A'){
                for (int i = 1; i <= 26; i++) {
                    int number = ch;
                    System.out.println(number + " = " + ch);
                    ch++;
                }
        }else{
            System.out.println("please follow the note ! ");
        }
    }

}
