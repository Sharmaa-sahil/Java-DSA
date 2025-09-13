import java.util.*;

public class OddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //take input
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        //check even or odd
        if(a%2==0){
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a + " is odd");
        }
        sc.close();
    }
}