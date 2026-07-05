// Practical 04 (c)
// Display details of three employees using array of objects.

public class EmployeeArray {

    int employeeId;
    String name;
    String department;
    double salary;

    void display() {

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);

        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        EmployeeArray[] employees = new EmployeeArray[3];

        employees[0] = new EmployeeArray();
        employees[0].employeeId = 14;
        employees[0].name = "Simran";
        employees[0].department = "AIML";
        employees[0].salary = 45000;

        employees[1] = new EmployeeArray();
        employees[1].employeeId = 15;
        employees[1].name = "Rahul";
        employees[1].department = "IT";
        employees[1].salary = 42000;

        employees[2] = new EmployeeArray();
        employees[2].employeeId = 16;
        employees[2].name = "Neha";
        employees[2].department = "HR";
        employees[2].salary = 40000;

        for (EmployeeArray employee : employees) {

            employee.display();
        }
    }
}

/*
==========================================
Explanation

This program creates an array
of Employee objects.

Each object stores the details
of one employee.

The for-each loop is used to
display all employee details.

Time Complexity : O(n)
Space Complexity : O(n)

==========================================
*/