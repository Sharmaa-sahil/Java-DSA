import java.util.*;

public class LargestOf2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Input two numbers
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();

        //If-Else check

        if(num1>num2){
            System.out.println(num1 + " is larger");

        }
        else if(num2>num1){
            System.out.println(num2 + " is larger");
        }

        else{
            System.out.println("both are equal");
        }
        sc.close();
    }
}