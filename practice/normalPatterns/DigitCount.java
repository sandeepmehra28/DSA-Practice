package normalPatterns;

import java.util.Scanner;

public class DigitCount {
//    public  int count(int number){
//        int count = 0;
//        while (number!=0){
//            number/=10;
//            count++;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        DigitCount firstCount = new DigitCount();
//        int userNumber = scanner.nextInt();
//        System.out.println(firstCount.count(userNumber));
    public  int digitCount(int number){
        int count = 0;
        while(number!=0){
            number/=10;
            count++;
        }
        return count;
    }
    public static void main(String... args) {
     Scanner scanner  = new Scanner(System.in);
     int userInput = scanner.nextInt();
     DigitCount newCount = new DigitCount();
     int finalOutput = newCount.digitCount(userInput);
        System.out.println("This is your final output: "+finalOutput);
}
}
