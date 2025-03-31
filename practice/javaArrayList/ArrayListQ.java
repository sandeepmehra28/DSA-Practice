package javaArrayList;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArrayListQ {
    public static void main(String[] args) {
        ArrayList<String> cl = new ArrayList<>();
        Scanner input  = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            cl.add(input.next().toUpperCase().trim());
        }
        cl.set(4,"null");
        for(int i = 0;i<=4;i++){
            switch (cl.get(i).toUpperCase(Locale.ROOT)){
                case "SANDEEP"-> System.out.println("YES SANDEEP IS IN FINAL YEAR STUDENT");
                case "SONU"-> System.out.println("YES SONU IS IN FINAL YEAR STUDENT");
                case "CHAMAN"-> System.out.println("YES CHAMAN IS IN FINAL YEAR STUDENT");
                case "SACHIN"-> System.out.println("YES SACHIN IS IN FINAL YEAR STUDENT");
                case "DILIP"-> System.out.println("YES DILIP IS IN FINAL YEAR STUDENT");
                default -> System.out.println("new student occur");
            }
        }
    }
}
