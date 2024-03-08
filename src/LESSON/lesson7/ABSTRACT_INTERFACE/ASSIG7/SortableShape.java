package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG7;

public interface SortableShape {

    double area();

    public class ShapeSorter {
        // Method to sort shapes in ascending order of their areas
        public static void sort(SortableShape[] shapes) {
            for (int i = 0; i < shapes.length - 1; i++) {
                for (int j = 0; j < shapes.length - i - 1; j++) {
                    if (shapes[j].area() > shapes[j + 1].area()) {
                        // Swap shapes[j] and shapes[j + 1]
                        SortableShape temp = shapes[j];
                        shapes[j] = shapes[j + 1];
                        shapes[j + 1] = temp;
                    }
                }
            }
        }
    }
}
