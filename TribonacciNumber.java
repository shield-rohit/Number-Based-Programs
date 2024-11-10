// Check if a number is a Tribonacci Number (part of the sequence where each term is sum of preceding three)

import java.util.Scanner;

public class TribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Tribonacci Number: ");
        int n = sc.nextInt();
        System.out.println(isTribonacciNumber(n));
    }

    static boolean isTribonacciNumber(int num) {
        int a = 0, b = 1, c = 1, d;
        while (a < num) {
            d = a + b + c;
            if (d == num)
                return true;
            a = b;
            b = c;
            c = d;
        }
        return false;
    }
}

// OUTPUT ---
// Enter a number to check if it is a Tribonacci Number: 4
// true

// Enter a number to check if it is a Tribonacci Number: 13
// true
