import java.util.*;

public class AreaOfCircle{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Ask the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        //calculate area using the formula:π * r^2
        float area = 3.14f * radius * radius;

        // Display the result 
        System.out.println("Area of circle: "+area);
    } 
}