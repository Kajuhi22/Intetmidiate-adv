package EmployeeManagementApplication;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeManagementApplication {

    // Employee class
    public static class Employee {
        private int id;
        private String name;
        private int age;
        private String designation;
        private String department;
        private double salary;

        public Employee(int id, String name, int age, String designation, String department, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.designation = designation;
            this.department = department;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation
                    + ", department=" + department + ", salary=" + salary + "]";
        }
    }

    // EmployeeService class
    public static class EmployeeService {
        HashSet<Employee> empset = new HashSet<>();

        Employee emp1 = new Employee(101, "Shital", 24, "Developer", "IT", 25000);
        Employee emp2 = new Employee(102, "Meena", 26, "Tester", "CO", 57000);
        Employee emp3 = new Employee(103, "Bob", 20, "DevOps Eng", "Admin", 5000);
        Employee emp4 = new Employee(104, "Max", 27, "System Eng", "CO", 70000);

        Scanner sc = new Scanner(System.in);
        boolean found = false;
        int id;
        String name;
        int age;
        String department;
        String designation;
        double sal;

        public EmployeeService() {
            empset.add(emp1);
            empset.add(emp2);
            empset.add(emp3);
            empset.add(emp4);
        }

        // View all employees
        public void viewAllEmps() {
            for (Employee emp : empset) {
                System.out.println(emp);
            }
        }

        // View employee based on their id
        public void viewEmp() {
            System.out.println("Enter id: ");
            id = sc.nextInt();
            found = false;
            for (Employee emp : empset) {
                if (emp.getId() == id) {
                    System.out.println(emp);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Employee with this id is not present");
            }
        }

        // Update the employee
        public void updateEmployee() {
            System.out.println("Enter id: ");
            id = sc.nextInt();
            found = false;
            for (Employee emp : empset) {
                if (emp.getId() == id) {
                    System.out.println("Enter name: ");
                    name = sc.next();
                    System.out.println("Enter new Salary");
                    sal = sc.nextDouble();
                    emp.setName(name);
                    emp.setSalary(sal);
                    System.out.println("Updated Details of employee are: ");
                    System.out.println(emp);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Employee is not present");
            } else {
                System.out.println("Employee details updated successfully!!");
            }
        }

        // Delete employee
        public void deleteEmp() {
            System.out.println("Enter id");
            id = sc.nextInt();
            found = false;
            Employee empdelete = null;
            for (Employee emp : empset) {
                if (emp.getId() == id) {
                    empdelete = emp;
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Employee is not present");
            } else {
                empset.remove(empdelete);
                System.out.println("Employee deleted successfully!!");
            }
        }

        // Add employee
        public void addEmp() {
            System.out.println("Enter id:");
            id = sc.nextInt();
            System.out.println("Enter name");
            name = sc.next();
            System.out.println("Enter age");
            age = sc.nextInt();
            System.out.println("Enter Designation");
            designation = sc.next();
            System.out.println("Enter Department");
            department = sc.next();
            System.out.println("Enter Salary");
            sal = sc.nextDouble();

            Employee emp = new Employee(id, name, age, designation, department, sal);

            empset.add(emp);
            System.out.println(emp);
            System.out.println("Employee added successfully");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        while (true) {
            System.out.println("**************** Welcome To Employee Management System ****************");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. View All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add Employee");
                    employeeService.addEmp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    employeeService.viewEmp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    employeeService.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    employeeService.deleteEmp();
                    break;
                case 5:
                    System.out.println("View All Employees");
                    employeeService.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank you for using the application!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
                    break;
            }
        }
    }
}
