// Program to find factorial of a number using function (iterative)

import java.util.*;

public class FindFactorial{
    // Function to calculate factorial
    static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;  //Multiply step by step
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);  // calling function

        // display result
        System.out.println("Factorial of "+num+" is: "+result);

        sc.close();
    }
}