import java.util.*;
public class HalfPyramidNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i = 1; i<=rows; i++){ // Outer loop: rows
            for(int j = 1; j<=i; j++){ // Inner loop: numbers in row
                System.out.print(j+ ""); //print number instead of stars

            }
            System.out.println();
        }
    }
}