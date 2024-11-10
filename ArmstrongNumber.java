// Check if a number is an Armstrong Number (sum of digits to the power of digit count equals the number)

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong Number: ");
        int n = sc.nextInt();
        System.out.println(isArmstrongNumber(n));
    }

    static boolean isArmstrongNumber(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }
}

// OUTPUT ---
// Enter a number to check if it is an Armstrong Number: 153
// true

// Enter a number to check if it is an Armstrong Number: 370
// true
