package lesson3;
import java.util.Arrays;
import java.util.Scanner;

public class RandomNumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the maximum number of values
        System.out.print("Enter the maximum number of values: ");
        int maxValueCount = scanner.nextInt();

        // Prompt the user to enter the minimum and maximum values for random number generation
        System.out.print("Enter the minimum value for random numbers: ");
        int minValue = scanner.nextInt();
        System.out.print("Enter the maximum value for random numbers: ");
        int maxValue = scanner.nextInt();

        // Generate random numbers
        int[] randomNumbers = new int[maxValueCount];
        for (int i = 0; i < maxValueCount; i++) {
            randomNumbers[i] = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
        }

        // Sort the array
        Arrays.sort(randomNumbers);

        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate mean
        double mean = calculateMean(randomNumbers);

        // Calculate mode
        int mode = calculateMode(randomNumbers);

        // Calculate median
        double median = calculateMedian(randomNumbers);

        // Display mean, mode, and median
        System.out.println("Mean: " + mean);
        System.out.println("Mode: " + mode);
        System.out.println("Median: " + median);

        scanner.close();
    }

    // Method to calculate the mean
    public static double calculateMean(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Method to calculate the mode
    public static int calculateMode(int[] numbers) {
        int mode = numbers[0];
        int maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = numbers[i];
            }
        }
        return mode;
    }

    // Method to calculate the median
    public static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers.length % 2 == 0) {
            return (double) (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2;
        } else {
            return (double) numbers[numbers.length / 2];
        }
    }
}