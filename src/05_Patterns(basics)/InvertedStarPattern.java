import java.util.*;
public class InvertedStarPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Take input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // outer loop
        for(int i = rows; i>=1; i--){ //start from rows and decrease
            for(int j = 1; j<=i; j++){ // print stars for current row
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
        sc.close();
    }
}

// Step 1: Outer loop (i)
//i represents the current row.
//rows is the total number of rows the user wants.
//We start from rows and go down to 1 (i-- means decrease i by 1 each time).
//Example: if rows = 5, i will be 5, 4, 3, 2, 1.

//Step 2: Inner loop (j)
//j counts how many stars to print in the current row.
//We print stars from 1 to i.
//Example:
//If i = 5 → j goes 1,2,3,4,5 → prints 5 stars.
//If i = 4 → j goes 1,2,3,4 → prints 4 stars.