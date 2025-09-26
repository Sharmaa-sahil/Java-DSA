import java.util.*;
public class Chpattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        char ch = 'A'; // starting charater

        for(int i = 1; i<=rows; i++){ // Outer loop: rows
            for(int j = 1; j<=i; j++){ // Inner loop: characters in row
                System.out.print(ch + " "); // Print the current character
                ch++;                        // Move to next character
            }
            System.out.println();           // Move to next row
        }
        sc.close();
    }
}