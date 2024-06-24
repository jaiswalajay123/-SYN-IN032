import java.util.Scanner;

public class PrimeChecker {
    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // Check if number is less than 2, not prime
        if (number < 2) {
            return false;
        }

        // Check for factors from 2 to the square root of number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        // If no factors were found, it's a prime number
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is prime and print the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
}
