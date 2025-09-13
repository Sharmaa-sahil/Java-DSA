/* Type Promotion in Expressions
--------------------------------
- When we perform operations on variables of smaller data types,
  Java automatically promotes them to a larger type before evaluating.
-  All byte, short, and char are promoted to int in expressions.
- if one operand is long,float or double the whole expression is promoted to long, float or double respectively.
*/

public class  TypePromotion{
    public static void main(String args[]){

        // byte + byte = int
        byte a = 10;
        byte b = 20;
        // byte c = a + b;   //  Error: result is int
        
        int c = a + b;   //  Correct
        System.out.println("Sum of byte a and b (promoted to int): " + c);
    }
}