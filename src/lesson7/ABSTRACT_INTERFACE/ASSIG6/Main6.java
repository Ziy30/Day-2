package lesson7.ABSTRACT_INTERFACE.ASSIG6;

public class Main6 {
    public static void main(String[] args) {
        // Create instances of Manager, Developer, and Intern
        Manager manager = new Manager("John Doe", 1001, 5000);
        Developer developer = new Developer("Jane Smith", 2002, 4000);
        Intern intern = new Intern("Bob Johnson", 3003, 1500);

        // Calculate salaries
        manager.calculateSalary();
        developer.calculateSalary();
        intern.calculateSalary();

        // Display details of each employee
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();

        System.out.println("Developer Details:");
        developer.displayDetails();
        System.out.println();

        System.out.println("Intern Details:");
        intern.displayDetails();
    }
}
