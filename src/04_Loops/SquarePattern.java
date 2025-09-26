import java.util.*;

public class SquarePattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //take input for square sixe
        System.out.print("Enter the size of square: ");
        int n = sc.nextInt();

        //outer loop for rows
        for(int i = 1; i<=n; i++){
            //inner loop for columns
            for(int j = 1; j<=n; j++){
                System.out.print("* "); //print star 
            }
            System.out.println(); // move to next line
        }
        sc.close();
    }
}