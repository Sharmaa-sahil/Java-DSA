/*
returnType methodName(parameters) {
    // body of method
    return value; // if returnType is not void
}
*/

// Example: Sum of 2 numbers

import java.util.*;

class Syntax{
    // Function definition
    static int add(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter two number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        //Function call
        int result = add(x, y);

        //Output
        System.out.println("Sum = "+result);

        sc.close();
    }
}
