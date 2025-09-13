public class ArithmeticOperators{
    public static void main(String args[]){
       // declare two numbers 
       int a = 15;
       int b = 4;


       // Perform arithmetic operations

       int sum = a+b;   //Addition
       int difference = a-b;    //Subtraction
       int product = a*b;   // Multiplication
       int quotient = a/b;  // Division (gives quotient only, since both are integers)
       int remainder = a%b; // Modulus (gives remainder)


       // Print results
       System.out.println("a = " + a + ", b = " + b);
       System.out.println("Addition(a + b) = "+ sum);
       System.out.println("Subtraction(a - b) = "+ difference);
       System.out.println("Product(a * b) = "+ product);
       System.out.println("Division(a / b) = "+ quotient);
       System.out.println("Modulus(a % b) = "+ remainder);

       // Demonstrate division with double for precise result
       double preciseDivision = (double)a/b;
       System.out.println("Precise division (a/b) = " + preciseDivision);
    }
}