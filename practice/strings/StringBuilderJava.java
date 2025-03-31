package strings;

import java.util.Scanner;

public class StringBuilderJava {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sandeep");
        //insert into String
        sb.insert(1,"u");
        System.out.println(sb);
        //delete
        sb.delete(1 ,2);
        System.out.println(sb);
    }
}
