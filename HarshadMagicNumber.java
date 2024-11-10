// Check if a number is a Harshad Magic Number (Harshad number with digit sum repeatedly adding to 1)
import java.util.Scanner;

public class HarshadMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Harshad Magic Number: ");
        int n = sc.nextInt();
        System.out.println(isHarshadMagicNumber(n));
    }

    static boolean isHarshadMagicNumber(int num) {
        if (!isHarshadNumber(num)) return false;
        while (num > 9) {
            num = digitSum(num);
        }
        return num == 1;
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
// Enter a number to check if it is a Harshad Magic Number: 1729
// true
