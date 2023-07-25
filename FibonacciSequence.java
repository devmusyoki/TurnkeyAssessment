// Import the Scanner class, which helps us read input from the user
import java.util.Scanner;

// Define the main class of our program
public class FibonacciSequence {
    // The main method, where our program starts running
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to store the user's input
        int n;

        // Use a 'do-while' loop to ensure that the user enters a positive integer
        do {
            // Ask the user to enter the number of Fibonacci sequence elements to generate
            System.out.print("Enter the number of Fibonacci sequence elements to generate (should be a positive integer): ");

            // Check if the user's input is not an integer (e.g., letters or symbols)
            while (!scanner.hasNextInt()) {
                // If the input is not an integer, display an error message
                System.out.print("Invalid input! Please enter a positive integer: ");
                // Move to the next input to avoid an infinite loop
                scanner.next();
            }

            // If the input is a valid integer, store it in the 'n' variable
            n = scanner.nextInt();

            // If the number is not positive (less than or equal to 0), display an error message
            if (n <= 0) {
                System.out.println("Invalid input! The number should be a positive integer.");
            }
        } while (n <= 0); // Repeat the loop until the user enters a positive integer

        // Close the Scanner object since we no longer need to read input
        scanner.close();

        // Now that we have a valid positive integer, we proceed to generate the Fibonacci sequence
        // Print a message indicating the start of the Fibonacci sequence
        System.out.print("Fibonacci sequence up to " + n + ": ");

        // Use a loop to generate and print the Fibonacci sequence up to the entered number 'n'
        for (int i = 0; i < n; i++) {
            // Call the 'fibonacci' method to calculate the Fibonacci number at position 'i'
            // and print it, followed by a space
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Function to calculate the nth Fibonacci number using iteration
    // 'n' is the index of the Fibonacci number to calculate
    public static int fibonacci(int n) {
        // The first two Fibonacci numbers are 0 and 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // For 'n' greater than 1, we calculate Fibonacci numbers iteratively
            // using two variables 'prev' and 'current' to store the previous two numbers
            // and 'result' to store the current Fibonacci number.
            int prev = 0;
            int current = 1;
            int result = 0;

            // Start the loop from index 2 (since we already have Fibonacci numbers at index 0 and 1)
            for (int i = 2; i <= n; i++) {
                // Calculate the current Fibonacci number by adding the previous two numbers
                result = prev + current;

                // Update 'prev' and 'current' for the next iteration
                prev = current;
                current = result;
            }

            // Return the calculated Fibonacci number
            return result;
        }
    }
}
