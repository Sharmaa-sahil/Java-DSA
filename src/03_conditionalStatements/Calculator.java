import java.util.*;

/*
-A simple calculator program using switch statement
-Supports: Addition, Subtraction, Multiplication, Division.
*/
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = sc.next().charAt(0); //  takes first character of input

        /* So if user types + →

           sc.next() → "+" (String)

           .charAt(0) → '+' (char)

           stored in operator.
        */

        double result; // to store final answer

        // Switch statement for operations

        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("Result = " +result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = "+ result); 
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = "+ result);
                break;

            case '/':
                if(num2 != 0){  //prevents division by zero
                    result = num1 / num2;
                    System.out.println("Result = "+ result);

                }  
                else{
                    System.out.println("Error: cannot divide by zero");
                }
                break;

                default:
                    // runs if user enters an invalid operator
                    System.out.println("Invalid operator! Please use +, -, * or /");


        }
        //Close Scanner to prevent memory leaks 
        sc.close();

    }
}