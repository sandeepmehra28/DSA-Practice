package switchStatements;
import java.util.Scanner;
public class nestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("emp id use 1 to 4: ");
        int empId= input.nextInt();

        switch (empId){
            case 1->System.out.println("SANDEEP MEHRA");
            case 2->System.out.println("SONU YADAV");
            case 3->System.out.println("SACHIN YADAV");
            case 4->System.out.println("CHAMAN SAINI");
            case 5-> {//nested switch
                System.out.println("emp 5");
                System.out.print("department [IT , LAW , ACCOUNT ] : ");
                String department = input.next().trim().toUpperCase();
                switch (department) {
                    case "IT"->System.out.println("IT DEPARTMENT");
                    case "LAW"->System.out.println("LAW DEPARTMENT");
                    case "ACCOUNT"->System.out.println("ACCOUNT DEPARTMENT");
                    default->System.out.println("unknown department");
                }
            }default->System.out.println("enter correct value..!");
        }
    }
}
