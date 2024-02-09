package lesson3;

public class MultiDimensional {

    public static void main(String[] args) {
        int[][][] a = { { { 1, 2, 3 }, { 4, 5 }, { 6 } }, { { 7, 8 }, { 9 } } };

        System.out.printf("a.length = %d", +a.length);

        for (int i = 0; i < a.length; i++) {

            System.out.printf("\na[%d].length = %d", i, a[i].length);

            for (int j = 0; j < a[i].length; j++) {

                System.out.printf("\na[%d][%d].length = %d\n", i, j, a[i][j].length);

                for (int k = 0; k < a[i][j].length; k++) {

                    System.out.printf("a[%d][%d][%d] = %d, ", i, j, k, a[i][j][k]);
                }
            }
        }
    }

}
