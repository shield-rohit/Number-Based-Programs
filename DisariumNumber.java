// Check if a number is a Disarium Number (sum of powered digits equals the number)

import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Disarium Number: ");
        int n = sc.nextInt();
        System.out.println(isDisariumNumber(n));
    }

    static boolean isDisariumNumber(int num) {
        int sum = 0, temp = num, len = String.valueOf(num).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len--);
            temp /= 10;
        }
        return sum == num;
    }
}

// OUTPUT ---
// Enter a number to check if it is a Disarium Number: 175
// true

// Enter a number to check if it is a Disarium Number: 89
// true
