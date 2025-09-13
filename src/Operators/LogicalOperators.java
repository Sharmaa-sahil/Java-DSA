/*
&& → Logical AND

|| → Logical OR

! → Logical NOT
*/


public class LogicalOperators{
    public static void main(String args[]){

        //Declare variables
        boolean x = true;
        boolean y = false;

        //Demonstrate logical AND (&&)
        System.out.println("x && y : "+ (x && y)); //true && false → false

        //Demonstrate logical OR (||)
        System.out.println("x || y :" + (x || y));  // true || false → true

        //Demonstrate logical NOT (!)
        System.out.println("!x : "+ (!x));   // !true → false
        System.out.println("!y : "+ (!y));   // !false → true


        //Use logical operators in conditions
        int a = 10, b = 20, c = 30;

        System.out.println("\n(a < b) && (b < c) : " + ((a < b) && (b < c))); // true && true → true
        System.out.println("(a > b) || (b < c) : " + ((a > b) || (b < c))); // false || true → true
        System.out.println("! (a < c) : " + (!(a < c))); // !(true) → false
    
    }
}