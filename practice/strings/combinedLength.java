package strings;

import java.util.Scanner;

public class combinedLength {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int size = input.nextInt();
        String [] array = new String[size];
        int totLength = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("value of i: "+i);
            array[i] = input.next();
            System.out.println("after input in array[i]: "+array[i]);
            totLength += array[i].length();
            System.out.println("after totLength: "+totLength);
        }
        System.out.println(totLength);
    }
}
