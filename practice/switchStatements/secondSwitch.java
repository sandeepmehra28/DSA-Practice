package switchStatements;
import java.util.Scanner;
public class secondSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
//        while (true){
//            System.out.print("Enter your roll number: ");
//            int rollNumOfStu = input.nextInt();
//            String output =switch (rollNumOfStu){
//                case 101 -> "SANDEEP\nBCA_FINAL_YEAR_STUDENT\n";
//                case 102 ->"SONU_YADAV\nBCA_FINAL_YEAR_STUDENT\n";
//                case 103 ->"SACHIN_YADAV\nBCA_FINAL_YEAR_STUDENT\n";
//                case 104 ->"CHAMAN_SAINI\nBCA_FINAL_YEAR_STUDENT\n";
//                default -> "Not Found Data..!";
//            };
//            System.out.println(output);
//        }
//        int number = input.nextInt();
//        switch (number){
//            case 1, 2 ,3:
//                System.out.println("number: "+number);
//                break;
//            default:
//                System.out.println("Invalid number..!");
//        }

//        while (true){
//            System.out.print("Enter your day in number: ");
//            int day = input.nextInt();
//            switch (day){
//                case 1-> {// this is a valid way to using curly-braces
//                    System.out.println("monday");
//                }
//                case 2-> System.out.println("tuesday");
//                case 3-> System.out.println("wednesday");
//                case 4-> System.out.println("thursday");
//                case 5-> System.out.println("friday");
//                case 6-> System.out.println("saturday");
//                case 7-> System.out.println("sunday");
//                default -> System.out.println("invalid ");
//            }
//        }

        int number  = input.nextInt();
        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekday");
            default:
                System.out.println("invalid day");
        }


    }
}
