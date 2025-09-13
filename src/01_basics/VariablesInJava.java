/*In this file, you'll learn how to:

Declare variables

Assign values

Print them using System.out.println()*/


public class VariablesInJava{
    public static void main(String args[]){
        //Declare variables
        int a = 20;
        int b = 12;
        String name = "Sahil";


        //Print the variables 
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Name: " + name);

        // we can also perform operations
        int sum = a+b;
        System.out.println("Sum: "+sum);
    }
}