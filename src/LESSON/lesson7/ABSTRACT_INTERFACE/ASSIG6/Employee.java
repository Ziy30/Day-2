package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG6;

public abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

     // Constructor
     public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void calculateSalary();

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }


}
