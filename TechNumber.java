// // Check if a number is a Tech Number (sum of halves squared equals the number)

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Tech Number: ");
        int n = sc.nextInt();
        System.out.println(isTechNumber(n));
    }

    static boolean isTechNumber(int num) {
        int digits = countDigits(num);

        if (digits % 2 != 0)
            return false;

        int divider = (int) Math.pow(10, digits / 2);
        int leftPart = num / divider;
        int rightPart = num % divider;

        int sum = leftPart + rightPart;
        return sum * sum == num;
    }

    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}

// OUTPUT ---

// Enter a number to check if it is a Tech Number: 2025
// true

// Enter a number to check if it is a Tech Number: 3025
// true