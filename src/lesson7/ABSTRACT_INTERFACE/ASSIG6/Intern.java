package lesson7.ABSTRACT_INTERFACE.ASSIG6;

public class Intern extends Employee {

    // Constructor
    public Intern(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void calculateSalary() {
        salary = 1000;
    }

}
