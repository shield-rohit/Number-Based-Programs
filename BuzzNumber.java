// Check if a number is a Buzz Number (divisible by 7 or ends with 7)

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Buzz Number: ");
        int n = sc.nextInt();
        System.out.println(isBuzzNumber(n));
    }

    static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}

// OUTPUT ---
// Enter a number to check if it is a Buzz Number: 49
// true

// Enter a number to check if it is a Buzz Number: 27
// true