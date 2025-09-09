public class DataTypesInJava{
    public static void main(String args[]){
        // Integer types
        byte bytevar = 100; //size- 1byte
        short shortvar = 20000;  // 2bytes
        int intvar = 100000;  // 4bytes
        long longvar = 100000000; //8bytes



        // Floating point types 
        float floatvar = 10.524f;  // 4bytes
        double doublevar = 20.9925452; // 8bytes

        
        // Character
        char letter = 'A'; // 2bytes

        //  Boolean
        boolean isJavaFun = true; 

        System.out.println("Byte: " + bytevar);
        System.out.println("Short: " + shortvar);
        System.out.println("Int: " + intvar);
        System.out.println("Long: " + longvar);
        System.out.println("Float: " + floatvar);
        System.out.println("Double: " + doublevar);
        System.out.println("Char: " + letter);
        System.out.println("Boolean: " + isJavaFun);

    }
}