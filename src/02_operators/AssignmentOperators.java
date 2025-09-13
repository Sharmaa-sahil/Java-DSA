public class AssignmentOperators{
    public static void main(String args[]){

        // Simple assignment (=)
        int a = 10; //assign 10 to a
        System.out.println("Initial value of a: "+ a);

        // Add and assign (+=)
        a+=5;  // a = a+5 
        System.out.println("After a+=5 : "+ a);

        // Subtract and assign (-=)
        a-=3;  // a = a - 3;
        System.out.println("After a-+3 : "+ a);

        // Multiply and assign (*=)
        a*=2;  // a = a*2;
        System.out.println("After a*=2 : "+ a);

        // Divide and assign (/=)
        a/=4; // a = a/4
        System.out.println("After a/=4 : "+ a);

        // Modulus and assign (%=)
        a%=5; // a = a%5
        System.out.println("After a%=5 : "+ a);

        // Bitwise AND assignment (&=)
        a = 7; // binary: 0111
        a &= 3;  // binary: 0011 → result: 0011 (3)
        System.out.println("After a &= 3 : "+a);

        // Bitwise OR assignment (|=)
        a |= 2;  //0011 | 0010 = 0011 (3)
        System.out.println("After a |= 2 : " + a);




    }
}