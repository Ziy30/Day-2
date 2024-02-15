package lesson7.ABSTRACT_INTERFACE.ASSIG6;

public class Manager extends Employee {

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void calculateSalary() {
      salary += 1000;
    }
    

}
