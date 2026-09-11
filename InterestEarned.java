/*
    Maddison Chin
    CMP129-80235
    Lab Assignment 1, Problem 2
    10 September 2026
*/
import java.util.Scanner;

public class InterestEarned {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        //declare variables
        double principal = 0.00;
        double interestRate = 0.00;
        int timesCompounded = 0;
        double interest = 0.00;
        double totalPredictedAmount = 0.00;
        double rate = 0;

        //prompt user for principal amount
        System.out.print("Enter principal: ");
        principal = keyboard.nextDouble();

        //prompt user for interest rate
        System.out.print("Enter interest Rate: ");
        interestRate = keyboard.nextDouble();
        rate = interestRate/100;

        //ask user for number of times interest compounded
        System.out.print("Enter number of times interest is compounded: ");
        timesCompounded = keyboard.nextInt();

        //display line to separate input info from report output
        System.out.println("------------------------------------------------------------");

         //calculate new balance in savings acct after one yr
        totalPredictedAmount = principal * Math.pow(1 + (rate/timesCompounded), timesCompounded);

        //calculate interest amount
        interest = (totalPredictedAmount - principal);
              

        //DISPLAY ALL INFORMATION
        System.out.println("Interest Rate:          " + interestRate);
        System.out.println("Times Compunded:         " + timesCompounded);
        System.out.printf("Principal:           $%.2f \n", principal);
        System.out.printf("Interest:            $%.2f \n", interest);
        System.out.printf("Amount in Savings:   $%.2f \n", totalPredictedAmount);

    }   //end of main method
}   //end of class
