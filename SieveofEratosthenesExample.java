import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenesExample {
    public static void main(String[] args) {
        SieveofEratosthenesExample obj = new SieveofEratosthenesExample();
        System.out.println("Please enter an integer number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        obj.countNumberOfPrimesUpTo(n);
    }

    void countNumberOfPrimesUpTo(int n) {
        long start = System.currentTimeMillis();
        boolean[] list = new boolean[n + 1];
        Arrays.fill(list, true);
        int upperBound = (int) (Math.sqrt(n) + 1);
        for (int i = 2; i <= upperBound; i++) {
            if (list[i] == true) {
                for (int j = 2; i * j <= n; j++) {
                    list[i * j] = false;
                }
            }
        }
        int numberOfPrimes = 0;
        for(boolean b : list) {
            if(b) {
                numberOfPrimes++;
            }
        }
        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println("There are " + (numberOfPrimes-2) + " prime numbers until " + n);
        System.out.println("Time: " + time + " ms.");
    }
}
