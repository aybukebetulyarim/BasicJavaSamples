import java.util.Scanner;

import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers number = new PrimeNumbers();
        System.out.println("Please enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(number.isPrime(n));
        number.calculatePrimeNumbers(n);
        //number.countNumberOfPrimesUpTo(n);

    }
    boolean isPrime(int n) {
        boolean prime = true;
        int i = 2;
        int upperBound = (int) (Math.sqrt(n) + 1);
        for (; i < upperBound; i++) {
            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        /*if(!prime) {
            System.out.println("First dividing: " + i);
        } */
        return prime;
    }
    void calculatePrimeNumbers(int n) {
        boolean prime = true;
        int i = 2;
        int upperBound = (int) (Math.sqrt(n) + 1);
        for (; i < upperBound; i++) {
            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        if(prime) {
            System.out.println(n + " is prime number");
        }
        else {
            System.out.println("First dividing: " + i);
        }
    }
    void countNumberOfPrimesUpTo(int n) {
        int numberOfPrimes = 0;
        for(int i = 2; i < n; i++) {
            boolean prime = isPrime(i);
            if(prime) {
                numberOfPrimes++;
            }
        }
        System.out.println("There are " + numberOfPrimes + " prime numbers.");
    }

}
