import java.io.*;

public class EmployeeTest {

    // This is a instance variable.
    // It is visible for any child class.
    int anotherValue = 10;

    // The following variable is declared as static. It is a constant.
    // In Java, final has the same meaning as const in JavaScript.
    final int value = 10;

    // This is a class variable.
    // It is visible for any child class.
    // It is not allowed to change the value of this variable after it is initiated.
    static int staticValue = 10;
    
    public static void main(String[] args) {
        // args is a parameter to the main method.
        // It is visible inside the main method only.
        // It is an array of type String.
        // It is used to pass command line arguments.
        // It is used to pass arguments to the main method.

        // These two are local variables.
        // They are declared inside a method.
        // Outside a method, they are not visible or usable.
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
