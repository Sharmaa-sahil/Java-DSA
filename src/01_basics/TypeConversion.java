//Implicit or Widening (Type Conversion) in Java

public class TypeConversion{
    public static void main(String args[]){

        int num = 100;  // int is 4 bytes
        double d = num;  //int automatically converted to double (8 bytes)

        System.out.println("Integer value: " + num);
        System.out.println("Converted to double value: "+ d);
    }
}



/*
Java automatically converts a smaller type to a larger type only if:

1. Compatible types
   - Both must be numeric types (e.g., int → double).
   - You cannot convert a boolean to another type.

2. Destination type is larger than source type
   - Example: int (4 bytes) → double (8 bytes) works.
   - But double → int does not happen automatically (needs casting).

3. No data loss guaranteed
   - Java only widens when it’s safe.
*/


/* byte → short → int → long → float → double
          ↑
        char
*/