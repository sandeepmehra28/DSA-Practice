package Questions.FirstJava;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class ChangeCurrency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your rupees: ");
        long rupees = input.nextLong();
        convertUSD(rupees);
    }
    static void convertUSD( long rupees){
        float usd =(float) 0.012*rupees;
        System.out.print("in USD = "+usd);
    }

}
//84.69 indian rupees for 1 dollor
