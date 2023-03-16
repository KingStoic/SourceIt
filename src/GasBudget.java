import java.util.Scanner;

public class GasBudget extends Main{
    public static void summary() {

        Scanner scan = new Scanner (System.in);
        double tax = (.075);

        System.out.println("How much is a gallon of gas?");
        double gasP = scan.nextDouble();

        System.out.println("What is your budget? \nPlease enter a dollar amount $:");

        double budget = scan.nextDouble();

        double taxedgallon = ((gasP * tax) + gasP);
        double total = budget / taxedgallon;

        scan.close();

        String message = ("That budget would be enough for " + Math.round(total) + " gallons(s) of gas.");
        //System.out.println("That budget would be enough for " + Math.round(total) + " gallons(s) of gas.");

        System.out.println(message);

    }
}
