public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        int total = 0;

        // Original Bug: Integer division here, which will truncate the decimal part.
        // This will lead to inaccurate average calculation.
        // double average = total / numbers.length;

        // Replacement Code: Convert either 'total' or 'numbers.length' to double before division.
        // This will ensure the division is done using double values and give the correct average.
        double average = (double) total / numbers.length;

        for (int num : numbers) {
            total += num;
        }

        return average;
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}
