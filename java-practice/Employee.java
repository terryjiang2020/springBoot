import java.io.*;

public class Employee {
    String name; // initialise variable name with type String
    int age; // initialise variable age with type int
    String designation; // initialise variable designation with type String
    double salary; // initialise variable salary with type double
    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesignation) {
        designation = empDesignation;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
