import java.util.Scanner;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
this.salary = salary;
    }

    public void displayInfo() {
System.out.println("Employee name: " + name);
System.out.println("Employee salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
super(name, salary);
this.department = department;
    }

    public void displayInfo() {
super.displayInfo();
System.out.println("Employee department: " + department);
    }
}

class Executive extends Manager {
    String location;

    public Executive(String name, double salary, String department, String location) {
super(name, salary, department);
this.location = location;
    }

    public void displayInfo() {
super.displayInfo();
System.out.println("Employee location: " + location);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee
System.out.print("Enter Employee name: ");
        String empName = scanner.nextLine();
System.out.print("Enter Employee salary: ");
        double empSalary = scanner.nextDouble();

        Employee employee = new Employee(empName, empSalary);

        // Input for Manager
scanner.nextLine();  // Consume the newline character
System.out.print("Enter Manager name: ");
        String mgrName = scanner.nextLine();
System.out.print("Enter Manager salary: ");
        double mgrSalary = scanner.nextDouble();
scanner.nextLine();  // Consume the newline character
System.out.print("Enter Manager department: ");
        String mgrDepartment = scanner.nextLine();

        Manager manager = new Manager(mgrName, mgrSalary, mgrDepartment);

        // Input for Executive
System.out.print("Enter Executive name: ");
        String execName = scanner.nextLine();
System.out.print("Enter Executive salary: ");
        double execSalary = scanner.nextDouble();
scanner.nextLine();  // Consume the newline character
System.out.print("Enter Executive department: ");
        String execDepartment = scanner.nextLine();
System.out.print("Enter Executive location: ");
        String execLocation = scanner.nextLine();

        Executive executive = new Executive(execName, execSalary, execDepartment, execLocation);

        // Display Information
System.out.println("\nEmployee Information:");
employee.displayInfo();

System.out.println("\nManager Information:");
manager.displayInfo();

System.out.println("\nExecutive Information:");
executive.displayInfo();

        // Close the scanner
scanner.close();
    }
}
