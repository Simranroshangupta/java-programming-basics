// Employee.java
// Represents an employee.

class Employee {

    // Data Members
    int employeeId;
    String employeeName;
    String department;
    double salary;

    // Method to display employee details
    void displayDetails() {

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + employeeName);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}

/*
==========================================
Explanation

Employee is a user-defined class.

It stores employee information
and provides a method to display it.

==========================================
*/