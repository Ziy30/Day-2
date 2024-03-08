package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG6;

public class Developer extends Employee {
    // Constructor
    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void calculateSalary() {
        salary += 500;
    }

}
