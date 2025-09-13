import java.util.*;

public class IfElse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Input a number
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // If-Else condition
        if(num>0){
            System.out.println(num + " is positive");
        }

        else{
            System.out.println(num + " is negative or zero.");
        }
        sc.close();
    }
}