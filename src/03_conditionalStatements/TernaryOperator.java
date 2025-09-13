import java.util.*;

public class TernaryOperator{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //Input a number 
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Ternary Operator
        String result = (num % 2 == 0)? "Even":"Odd";
        System.out.println(num + " is " + result);

        sc.close();
    }
    
}



// variable = (condition) ? value_if_true : value_if_false;