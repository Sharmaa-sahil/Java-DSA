import java.util.*;
public class StarPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Take input for lines
        System.out.print("Number of lines in half pyramid: ");
        int n = sc.nextInt();

        //Outer loop for rows
        for(int i = 1;i<=n; i++){
            //Inner loop for column
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
             System.out.println(); // move to next line
        }
       
        sc.close();
    }
}