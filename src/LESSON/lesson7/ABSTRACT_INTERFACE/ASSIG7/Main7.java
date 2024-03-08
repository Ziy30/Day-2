package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG7;

import LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG7.SortableShape.ShapeSorter;

public class Main7 {
    public static void main(String[] args) {
        // Create an array of SortableShape objects
        SortableShape[] shapes = new SortableShape[3];
        shapes[0] = new Rectangle(4, 5);
        shapes[1] = new Circle(3);
        shapes[2] = new Triangle(6, 8);

        // Sort the array of shapes based on their areas
        ShapeSorter.sort(shapes);

        // Print the areas of shapes after sorting
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Area of shape " + (i + 1) + ": " + shapes[i].area());
        }
    }
}
