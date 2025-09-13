/* Type Casting (Narrowing Conversion)

- When we convert a larger data type into a smaller one.
- This is NOT automatic (unlike widening conversion).
- We must do it manually using (type).
- There is a risk of data loss.
*/

public class TypeCasting{
    public static void main(String args[]){

        // float to int
        float a = 22.25f;
        int b = (int)a;
        System.out.println(b);
    }
}