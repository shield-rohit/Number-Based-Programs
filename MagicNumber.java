// Check if a number is a Magic Number (sum of digits repeatedly added equals 1)

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Magic Number: ");
        int n = sc.nextInt();
        System.out.println(isMagicNumber(n));
    }

    static boolean isMagicNumber(int num) {
        while (num > 9) {
            num = digitSum(num);
        }
        return num == 1;
    }

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

// OUTPUT ---
// Enter a number to check if it is a Magic Number: 1729
// true

// Enter a number to check if it is a Magic Number: 19
// true
