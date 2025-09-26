import java.util.*;

public class Print1toN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        // Initialize counter
        int i = 1;

        // While loop to print 1 to N
        while(i<=N){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}