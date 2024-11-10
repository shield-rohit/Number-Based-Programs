// Check if a number is a Pronic Number (product of two consecutive integers)

import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Pronic Number: ");
        int n = sc.nextInt();
        System.out.println(isPronicNumber(n));
    }

    static boolean isPronicNumber(int num) {
        for (int i = 0; i * (i + 1) <= num; i++) {
            if (i * (i + 1) == num)
                return true;
        }
        return false;
    }
}

// OUTPUT ---
// Enter a number to check if it is a Pronic Number: 12
// true

// Enter a number to check if it is a Pronic Number: 20
// true
