import java.util.*;

public class SumOfN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number N = ");
        int N = sc.nextInt();

        // Initialize variables
        int i = 1;
        int sum = 0;

        // while loop to sum 1 to N numbers
        while(i<=N){
            sum+=i;     // add i to sum
            i++;        // increment counter   
        }

        // Display result
        System.out.println("Sum of first " + N +" numbers = "+ sum);
        sc.close();
    }
}