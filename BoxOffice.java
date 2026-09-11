/*
    Maddison Chin
    CMP129-80235
    Lab Assignment 1, Problem 1
    10 September 2026
*/

    import java.util.Scanner;

public class BoxOffice {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        //declare variables
        String movieName;
        int Atickets;
        int Ctickets;
        double AticketPrice = 10.00;
        double CticketPrice = 6.00;
        double AticketProfit = 0;
        double CticketProfit = 0;
        double grossProfit = 0;
        double netProfit = 0;
        double distrPay = 0;

        //ask user for movie name
        System.out.print("Movie Name: ");
        movieName = keyboard.nextLine();

        //ask user for adult tickets sold
        System.out.print("Adult Tickets Sold: ");
        Atickets = keyboard.nextInt();
            //calculate adult tickets profit
            AticketProfit = AticketPrice * Atickets;
        
        //ask user for child tickets sold
        System.out.print("Child Tickets Sold: ");
        Ctickets = keyboard.nextInt();
            //calculate child tickets profit
            CticketProfit = CticketPrice * Ctickets;
            //calculate total gross box office profit
            grossProfit = AticketProfit + CticketProfit;
            //calculate net profit
            netProfit = grossProfit * 0.20;
            //calculate amount paid to distributor
            distrPay = grossProfit *0.80;

        //display line to separate input info from report output
        System.out.println("------------------------------------------------------------");

        //DISPLAY ENTIRE REPORT
        //display movie name in quotes
        System.out.println("Movie Name:                     " + movieName);
        //display adult tickets sold
        System.out.println("Adult Tickets Sold:                   " + Atickets);
        //display child tickets sold
        System.out.println("Child Tickets Sold:                   " + Ctickets);
        //display gross profit
        System.out.printf("Gross Box Office Profit:            $%.2f \n", grossProfit);
        //display net profit
        System.out.printf("Net Box Office Profit:              $%.2f \n", netProfit);
        //display amount paid to distributor
        System.out.printf("Amount Paid to Distributor:         $%.2f \n", distrPay);

    }   //end of main method
}   //end of class
