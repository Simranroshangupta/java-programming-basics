// Practical 04 (b)
// Create an Employee class and display employee details.

public class Employee {

    int employeeId;
    String name;
    String department;
    double salary;

    void display() {

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.employeeId = 14;
        employee.name = "Simran";
        employee.department = "AIML";
        employee.salary = 45000;

        employee.display();
    }
}

/*
==========================================
Explanation

This program creates an Employee
object and stores employee details.

The display() method prints all
the information of the employee.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/