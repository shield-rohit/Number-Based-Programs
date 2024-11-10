// // Check if a number is a Duck Number (contains '0' but not at the beginning)

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Duck Number: ");
        int num = sc.nextInt();
        System.out.println(isDuckNumber(num));
    }

    static boolean isDuckNumber(int num) {
        if (num == 0) return false; 
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit == 0 && num / 10 > 0) return true;
            num /= 10;
        }
        return false;
    }
}


// OUTPUT ---

// Enter a number to check if it is a Duck Number: 203
// true

// Enter a number to check if it is a Duck Number: 0
// false