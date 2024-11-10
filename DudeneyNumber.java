
// Check if a number is a Dudeney Number (sum of digits equals the cube root of the number)
import java.util.Scanner;

public class DudeneyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Dudeney Number: ");
        int n = sc.nextInt();
        System.out.println(isDudeneyNumber(n));
    }

    static boolean isDudeneyNumber(int num) {
        int sum = digitSum(num);
        int cubeRoot = (int) Math.round(Math.cbrt(num));
        return cubeRoot * cubeRoot * cubeRoot == num && sum == cubeRoot;
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
// Enter a number to check if it is a Dudeney Number: 512
// true

// Enter a number to check if it is a Dudeney Number: 1
// true
