// Check if a number is a Neon Number (sum of square’s digits equals the number)

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Neon Number: ");
        int n = sc.nextInt();
        System.out.println(isNeonNumber(n));
    }

    static boolean isNeonNumber(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
}

// OUTPUT ---
// Enter a number to check if it is a Neon Number: 9
// true

// Enter a number to check if it is a Neon Number: 1
// true
