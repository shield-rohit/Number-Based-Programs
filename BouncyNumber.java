// Check if a number is a Bouncy Number (digits are neither entirely increasing nor decreasing)

import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Bouncy Number: ");
        int n = sc.nextInt();
        System.out.println(isBouncyNumber(n));
    }

    static boolean isBouncyNumber(int num) {
        boolean increasing = false, decreasing = false;
        int lastDigit = num % 10;
        num /= 10;
        while (num > 0) {
            int digit = num % 10;
            if (digit < lastDigit)
                increasing = true;
            if (digit > lastDigit)
                decreasing = true;
            if (increasing && decreasing)
                return true;
            lastDigit = digit;
            num /= 10;
        }
        return false;
    }
}

// OUTPUT ---
// Enter a number to check if it is a Bouncy Number: 132
// true

// Enter a number to check if it is a Bouncy Number: 253
// true
