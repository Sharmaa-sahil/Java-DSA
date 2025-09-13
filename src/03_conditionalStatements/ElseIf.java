import java.util.*;

public class ElseIf{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Else-if ladder for grading
        if(marks>=90){
            System.out.println("Grade: A");
        }
        else if(marks>=75){
            System.out.println("Grade: B");
        }
        else if(marks>=50){
            System.out.println("Grade: C");
        }
        else if(marks>=33){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Fail");  
        }
        sc.close();
    }
}