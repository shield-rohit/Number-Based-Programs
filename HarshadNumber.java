// Check if a number is a Harshad Number (divisible by the sum of its digits)
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Harshad Number: ");
        int n = sc.nextInt();
        System.out.println(isHarshadNumber(n));
    }

    static boolean isHarshadNumber(int num) {
        int sum = digitSum(num);
        return num % sum == 0;
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
// Enter a number to check if it is a Harshad Number: 18
// true

// Enter a number to check if it is a Harshad Number: 24
// true
