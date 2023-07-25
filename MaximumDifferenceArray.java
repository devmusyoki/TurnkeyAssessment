import java.util.Scanner;

public class MaximumDifferenceArray {

    // Function to find the maximum difference between any two numbers in the array
    public static int findMaxDifference(int[] arr) {
        // Check if the array is null or has less than two elements
        if (arr == null || arr.length < 2) {
            // If the array is empty or has only one element, return 0 as there is no difference.
            return 0;
        }

        // Initialize variables to keep track of the maximum and minimum values in the array
        int max = arr[0]; // Assume the first element is the maximum
        int min = arr[0]; // Assume the first element is the minimum

        // Loop through the array to find the actual maximum and minimum values
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than the current maximum, update the maximum
            if (arr[i] > max) {
                max = arr[i];
            }

            // If the current element is smaller than the current minimum, update the minimum
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Calculate and return the maximum difference between the maximum and minimum values
        return max - min;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();

        int a[] = new int[n];

        // Ask the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Call the findMaxDifference function to get the maximum difference
        int maxDifference = findMaxDifference(a);

        // Display the maximum difference to the user
        System.out.println("Maximum Difference=" + maxDifference);
    }
}
