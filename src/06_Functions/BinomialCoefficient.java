// Program to calculate nCr using factorial function

import java.util.*;

public class BinomialCoefficient{
    static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    // Function to calculate nCr
    static int nCr(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

        return fact_n / (fact_r * fact_nr);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int result = nCr(n, r);

        System.out.println("Binomial Coefficient ("+n+ "c"+r+") = "+result);

        sc.close();
    }
}
