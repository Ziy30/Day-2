import java.util.Arrays;

public class Matrix<T> {
    private T[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = (T[][]) new Object[rows][cols];
    }

    public void setElement(int row, int col, T element) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            matrix[row][col] = element;
        } else {
            throw new IllegalArgumentException("Invalid row or column index");
        }
    }

    public T getElement(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return matrix[row][col];
        } else {
            throw new IllegalArgumentException("Invalid row or column index");
        }
    }

    public void transpose() {
        T[][] transposed = (T[][]) new Object[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        matrix = transposed;
        int temp = rows;
        rows = cols;
        cols = temp;
    }

    public void add(Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Add corresponding elements
                // This assumes that elements of type T are addable (e.g., integers, doubles)
                matrix[i][j] = (T)((Number) matrix[i][j]).doubleValue() + ((Number) other.matrix[i][j]).doubleValue();
            }
        }
    }

    public void multiply(Matrix<T> other) {
        if (cols != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must match number of rows in the second matrix for multiplication");
        }
        T[][] result = (T[][]) new Object[rows][other.cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < cols; k++) {
                    // Multiply corresponding elements
                    // This assumes that elements of type T are multiplicable (e.g., integers, doubles)
                    result[i][j] = (T) ((Number) result[i][j]).doubleValue() + ((Number) matrix[i][k]).doubleValue() * ((Number) other.matrix[k][j]).doubleValue();
                }
            }
        }
        matrix = result;
        cols = other.cols;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T[] row : matrix) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Matrix<Integer> matrix1 = new Matrix<>(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);

        Matrix<Integer> matrix2 = new Matrix<>(2, 2);
        matrix2.setElement(0, 0, 5);
        matrix2.setElement(0, 1, 6);
        matrix2.setElement(1, 0, 7);
        matrix2.setElement(1, 1, 8);

        System.out.println("Matrix 1:");
        System.out.println(matrix1);
        System.out.println("Matrix 2:");
        System.out.println(matrix2);

        // Transpose Matrix 1
        matrix1.transpose();
        System.out.println("Transposed Matrix 1:");
        System.out.println(matrix1);

        // Add Matrix 1 and Matrix 2
        matrix1.add(matrix2);
        System.out.println("Matrix 1 + Matrix 2:");
        System.out.println(matrix1);

        // Multiply Matrix 1 and Matrix 2
        matrix1.multiply(matrix2);
        System.out.println("Matrix 1 * Matrix 2:");
        System.out.println(matrix1);
    }
}