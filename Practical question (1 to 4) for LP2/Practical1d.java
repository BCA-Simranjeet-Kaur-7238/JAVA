//Write a Java program to find and print the prime factors of a given numbers. Use loops to iterate through possible factors.


import java.util.Scanner;

class PrimeFactor{
    public static void primeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n);
        }
    }
}
public class Practical1d  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int number = sc.nextInt();        
        System.out.print("Prime factors of " + number + " are: ");
        PrimeFactor.primeFactors(number);
    }
}
