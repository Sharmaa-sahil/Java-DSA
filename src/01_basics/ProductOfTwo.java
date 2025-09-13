import java.util.*;

public class ProductOfTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Take input for first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Take input for second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        //Calculate the product
        int product = num1*num2;

        // Display the result
        System.out.println("Product: "+product);
    }
}