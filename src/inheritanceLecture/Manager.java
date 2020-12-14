package inheritanceLecture;

import java.util.ArrayList;

public class Manager extends Employee{

    public Manager(String name){
        super(name);
    }
    public ArrayList<Employee> manageEmployee(ArrayList<Employee> employees){
        System.out.println("Managing employees");
        return employees;
    }

    public static void main(String[] args) {
        Employee bob = new Developer("Bob");
        Employee john = new Developer("John");
        Developer johnDev = new Developer("John Developer");
        Employee jane = new Teacher("Jane");

        Manager bernice = new Manager("Bernice");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(bob);
        employees.add(john);
        employees.add(jane);
//        employees.add(johnDev); <- this will not work. wrong type

        bernice.manageEmployee(employees);

    }
}
