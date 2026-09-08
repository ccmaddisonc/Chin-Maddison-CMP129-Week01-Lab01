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

        //prompt user for principal amount
        System.out.print("Enter principal: ");
        principal = keyboard.nextDouble();

        //prompt user for interest rate
        System.out.print("Enter interestRate: ");
        interestRate = keyboard.nextDouble();

        //ask user for number of times interest compounded
        System.out.print("Enter number of times interest is compounded: ");
        timesCompounded = keyboard.nextInt();

        //calculate interest amount
        interest = (principal * interestRate);
        System.out.println("Interest: " + interest);

        //calculate new balance in savings acct after one yr
        totalPredictedAmount = principal * (1 + interestRate/timesCompounded);
        System.out.printf("Amount in Savings: $%.2f", totalPredictedAmount);

    }   //end of main method
}   //end of class
