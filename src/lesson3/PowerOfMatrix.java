package lesson3;

import java.util.Scanner;

public class PowerOfMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of Square Matrix A : ");
        int d = scan.nextInt();

        // Create arrays for matrix A, B, and C
        int[][] a = new int[d][d];
        int[][] b = new int[d][d];
        int[][] c = new int[d][d];

        // Prompt the user to enter elements of matrix 
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {

                System.out.print("Enter element A[" + i + "][" + j + "]: ");
                a[i][j] = scan.nextInt();
                
                // Initialize matrix B with the same elements as matrix A
                b[i][j] = a[i][j];
            }
        }

        // Prompt the user to enter the power n
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();

        // Calculate A to the power of n
        for (int k = 2; k <= n; k++) {
            // Multiply matrix B (Ak-1) with matrix A
            multiplyMatrices(b, a, c, d);
            // Copy the result from matrix C to matrix B for the next iteration
            copyMatrix(c, b, d);
        }

        // Print the result matrix B which is A to the power of n
        System.out.println("Result of A to the power of " + n + ":");
        printMatrix(b, d);

        scan.close();
    }

    // Function to multiply two matrices and store the result in the third matrix
    public static void multiplyMatrices(int[][] a, int[][] b, int[][] c, int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                c[i][j] = 0;
                for (int k = 0; k < dim; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    // Function to copy elements from one matrix to another
    public static void copyMatrix(int[][] source, int[][] destination, int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                destination[i][j] = source[i][j];
            }
        }
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix, int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
