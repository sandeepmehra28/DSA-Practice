package switchStatements;
import java.util.Scanner;
public class firstSwitch {

    public static void main(String[] args) {
        System.out.println("BCA final year data....! ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String nameOfStudent = input.next().trim().toUpperCase();
        while (true) {
            if (nameOfStudent.equals("SONU") || nameOfStudent.equals("SACHIN")
                    || nameOfStudent.equals("CHAMAN") || nameOfStudent.equals("SANDEEP")
            ) {
                if (nameOfStudent.equals("SONU")) {
                    System.out.printf("NAME : SONU\nAGE: 21\nADDRESS: BARODA_MEO");
                    break;
                }
                if (nameOfStudent.equals("SACHIN")) {
                    System.out.printf("NAME: SACHIN\nAGE: 21\nADDRESS: BARODA_MEO");
                    break;
                }
                if (nameOfStudent.equals("RAHEESH")) {
                    System.out.printf("NAME: RAHEESH\nAGE: 20\nADDRESS: ALWAR");
                    break;
                }
                if (nameOfStudent.equals("SANDEEP")) {
                    System.out.printf("NAME: SANDEEP\nAGE: 22\nADDRESS: ALWAR_KHUDANPURI");
                    break;
                }
            } else {
                System.out.println("NO DATA FOUND...!");
                break;
            }
        }
    }
}

