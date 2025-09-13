public class UnaryOperators{
    public static void main(String args[]){
        
        // declare variables
        int a = 5;
        int b = -10;
        boolean flag = true;

        // Demonstrate unary plus (+) and minus (-)
        System.out.println("Unary Plus (+a) = "+ (+a)); // Keeps value as it is → 5
        System.out.println("Unary Minus (-a) = " + (-a));   // Changes sign → -5
        System.out.println("Unary Minus (-b) = " + (-b));   // -(-10) = 10

        // Demonstrate increment and decrement 
        System.out.println("\nInitial a = " + a);

        //Post-Increment(a++)
        System.out.println("Post-increment(a++) = " + (a++));   //prints 5, then 'a' becomes 6
        System.out.println("Value of 'a' after post-increment = " + a); //6

        //Pre-Increment(++a)
        System.out.println("Pre-increment(++a) = "+ (++a));   //'a' becomes 7, then prints 7

        //Post-Decrement(a--)
        System.out.println("Post-decrement(a--) = "+ (a--));  //prints 7, then 'a' becomes 6
        System.out.println("Value of 'a' after post-decrement = "+ a );  //6

        //Pre-Decrement(--a)
        System.out.println("Pre-decrement(--a) = "+ (--a)); //'a' becomes 5, then prints 5

        //Demonstrate logical NOT(!)
        System.out.println("\nflag = "+ flag);
        System.out.println("Logical NOT (!flag) = "+ (!flag)); //reverse boolean value 
    }
}


/* When to use each

+a → Rarely used (only for clarity, not required).

-a → Flip sign quickly.

++ / -- → Increase or decrease values, especially in loops.

! → Work with boolean conditions. */