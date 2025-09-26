// program to print all prime numbers in a given range

import java.util.*;

public class PrimeInRange{

    // Function to check if a number is prime
    static boolean isPrime(int n){
        if(n<=1){
            return false;  //0 and 1 are not primes 
        }

        for(int i =2; i*i<=n; i++){
            if(n%i==0){
                return false;  // divisible → not prime
            }
        }
        return true;
    }

    // function to print primes in ranges

    static void printPrimes(int start, int end){
        System.out.println("Prime numbers between "+start+" and "+end+" are: ");
        for(int i = start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();  // new line at end
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        printPrimes(start, end);

        sc.close();
    }
}