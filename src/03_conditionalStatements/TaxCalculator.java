import java.util.*;

public class TaxCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Input Income
        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double tax;

        //Tax calculation based on slabs
        if(income<=250000){
            tax = 0; //No Tax
        }

        else if(income<=500000){
            tax = (income - 250000) * 0.05;  // 5% tax on income above 2.5L
        }
        else if(income<=1000000){
            tax = (250000 * 0.5) + (income - 500000)*0.20;  //5% + 20%
        }
        else{
            tax = (250000 * 0.5) + (income - 500000)*0.20 + (income - 1000000)*0.30;  //  5% + 20% + 30%
        }
        // Output Result
        System.out.println("Your income tax = ₹" + tax);

        sc.close();
    }
}