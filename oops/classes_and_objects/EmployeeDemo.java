// EmployeeDemo.java
// Demonstrates creating Employee objects.

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.employeeId = 1001;
        employee1.employeeName = "Amit";
        employee1.department = "IT";
        employee1.salary = 55000;

        Employee employee2 = new Employee();

        employee2.employeeId = 1002;
        employee2.employeeName = "Neha";
        employee2.department = "Human Resources";
        employee2.salary = 48000;

        System.out.println("Employee 1");
        employee1.displayDetails();

        System.out.println();

        System.out.println("Employee 2");
        employee2.displayDetails();
    }
}

/*
==========================================
Explanation

Multiple objects can be created
from the same class.

Each object stores its own values.

==========================================
*/