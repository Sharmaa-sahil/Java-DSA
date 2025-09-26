import java.util.*;
// Program to check if a number is prime or not.
public class PrimeCheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Step1: take input
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true; // assume number is prime

        // Step2: handle edge cases
        if(n<=1){
            isPrime= false; // 0,1 and negatives are not primes
        }
        else{
            // Step3: check divisibility up to sqrt(n)
            for(int i=2; i*i<=n; i++){
                if(n%i == 0){ // if divisible by i
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }
        // Step4: Display result
        if(isPrime){
            System.out.println(n+ " is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        sc.close();

    }
}