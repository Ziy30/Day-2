package lesson7.ABSTRACT_INTERFACE.ASSIG4;

public class SelectionSort implements Sortable {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

}
