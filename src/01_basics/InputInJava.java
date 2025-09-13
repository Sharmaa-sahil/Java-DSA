/* The Scanner class is used to get user input, and
it is found in  java.util package. */

import java.util.*; // *means- : Importing everything from java.util. we can also use java.util.Scanner for importing scanner class only

public class InputInJava{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);// create scanner object   
    //"Scanner" A class in Java used to read input
    //"sc" The name of the Scanner object (you can name it anything like input, scanner, etc.).
    //"new Scanner" Creates a new Scanner object in memory.
    //"System.in" Means standard input. It tells the Scanner to read input from the user.




    // Take different types of inputs from user
    System.out.print("Enter your first name: ");
    String Firstname = sc.next(); // Read one word only

    sc.nextLine(); // Important! It consume the leftover newline after next() otherwise it skips the input.

    System.out.print("Enter your full name: ");
    String Fullname = sc.nextLine(); // Read string input

    System.out.print("Enter your age: ");
    int age = sc.nextInt(); //Read integer input

    System.out.print("Enter your height: ");
    float height = sc.nextFloat(); //Read float input

    System.out.println("hello! your first name is " +Firstname + ". your full name is "+ Fullname +"! You are "+age+ "years old and your height is "+height  );

    
    sc.close(); //Always close the scanner to free up any system resources it was using.
    }
}