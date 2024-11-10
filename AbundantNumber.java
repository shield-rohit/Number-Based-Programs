// Check if a number is an Abundant Number (sum of divisors is greater than the number)

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Abundant Number: ");
        int n = sc.nextInt();
        System.out.println(isAbundantNumber(n));
    }

    static boolean isAbundantNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum > num;
    }
}

// OUTPUT ---
// Enter a number to check if it is an Abundant Number: 12
// true

// Enter a number to check if it is an Abundant Number: 18
// true
