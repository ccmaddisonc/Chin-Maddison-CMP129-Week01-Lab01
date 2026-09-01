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

        //display and ask user for movie name
        System.out.print("Movie Name: ");
        movieName = keyboard.nextLine();

        //display and ask user for adult tickets sold
        System.out.print("Adult Tickets Sold: ");
        Atickets = keyboard.nextInt();
            //calculate adult tickets profit
            AticketProfit = AticketPrice * Atickets;
        
        //display and ask user for child tickets sold
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

        //display gross profit
        System.out.println("Gross Box Office Profit: $" + grossProfit);

        //display net profit
        System.out.println("Net Box Office Profit:  $" + netProfit);

        //display amount paid to distributor
        System.out.println("Amount Paid to Distributor: $" + distrPay);

    }   //end of main method
}   //end of class
