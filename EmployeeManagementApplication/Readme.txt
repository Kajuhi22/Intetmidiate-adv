Challenges Faced:
         1.Concurrency Issues(i.e like scanner ,hash)
         2.Input Validation
        3.Updating and Deleting Employees
         4.combining and writting my own version of code
Description
1. Employee Class
This class models an employee with attributes such as ID, name, age, designation, department, and salary. It includes constructors, getter and setter methods for encapsulation, and a toString() method for easy printing of employee details.

2. EmployeeService Class
This class handles the core functionality of the Employee Management System. It maintains a set of employees using a HashSet and includes methods for viewing, adding, updating, and deleting employees. It also has pre-defined employees added in the constructor for initial testing.

viewAllEmps(): Displays all employees.
viewEmp(): Displays a specific employee based on ID.
updateEmployee(): Updates the name and salary of an employee based on ID.
deleteEmp(): Deletes an employee based on ID.
addEmp(): Adds a new employee with user input details.
3. Main Method
The main method runs a loop presenting a menu to the user, allowing them to choose various operations (add, view, update, delete, view all, exit). It uses a Scanner for input and an instance of EmployeeService to perform the selected operations.
