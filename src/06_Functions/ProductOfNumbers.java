// Program to find the product of two numbers using a function

import java.util.*;

public class ProductOfNumbers{
    // Function (method) to calculate product
    static int product(int a, int b){
        return a*b;     //Multiply and return result
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // calling function and storing result
        int result = product(num1, num2);

        // display output
        System.out.println("Product of "+num1+" and "+num2+" is: "+result);

        sc.close();
    }
}