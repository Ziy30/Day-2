package LESSON.lesson3;

public class SelectionSort {

    public static int findMinIdx(double[] d, int k) {
        int minIdx = k;
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] < d[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int findMaxIdx(double[] d, int k) {
        int maxIdx = k;
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] > d[maxIdx]) {
                maxIdx = i;
            }

        }
        return maxIdx;
    }

    public static double findKthLargest(double[] array, int k) {
        // Check if k is within the valid range
        if (k < 1 || k > array.length) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        // Perform k selections to find the kth largest element
        for (int i = 0; i < k - 1; i++) {
            int maxIdx = findMaxIdx(array, i);
            // Swap the max element with the current element at position i
            double temp = array[i];
            array[i] = array[maxIdx];
            array[maxIdx] = temp;
        }

        // After k selections, the kth largest element is at position k - 1
        return array[k - 1];
    }

    public static void main(String[] args) {
        // Example array
        double[] array = { 3.5, 2.1, 6.8, 1.9, 9.4, 5.7 };
        // Value of k
        int k = 5;

        // Find the kth largest element
        double kthLargest = findKthLargest(array, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }

}
