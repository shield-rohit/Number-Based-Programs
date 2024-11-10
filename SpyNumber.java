// Check if a number is a Spy Number (sum of digits equals product of digits)

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Spy Number: ");
        int n = sc.nextInt();
        System.out.println(isSpyNumber(n));
    }

    static boolean isSpyNumber(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }
}

// OUTPUT ---

// Enter a number to check if it is a Spy Number: 112
// false

// Enter a number to check if it is a Spy Number: 22
// true
