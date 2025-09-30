package Algorithms;

import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Create a boolean array of size n+1 (so we can directly use numbers as indices)
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }

    // Sieve of Eratosthenes function
    // false in array means number is prime
    static void sieve(int n, boolean[] primes){
        // Loop through all numbers from 2 up to sqrt(n)
        for (int i = 2; i*i <= n; i++) {
            // If i is still marked as prime
            // At the start, every number is assumed prime (false)
            // When we find a number i that is still false, it means none of the smaller primes divided it earlier, so it is prime
            if(!primes[i]){
                // Mark all multiples of i as not prime
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;         // Mark as not prime
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){              // If still false, it's prime
                System.out.print(i + " ");
            }
        }
    }
}
