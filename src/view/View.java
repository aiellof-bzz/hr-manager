package view;

import db.EmployeeDB;
import models.Employee;
import util.HRManagerUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class View {

    private static final Scanner scanner = new Scanner(System.in);
    private static EmployeeDB db = new EmployeeDB();


    /**
     * Show the interface to add a employee to the db
     */
    public void showAddEmployee() throws ParseException {
        //TODO: implement
        System.out.println("------ Add Employee ------");

        System.out.println("Enter employee details:");

        System.out.print("First Name: ");
        String prename = scanner.nextLine();

        System.out.print("Last Name: ");
        String surname = scanner.nextLine();

        System.out.print("Job Description: ");
        String jobDescription = scanner.nextLine();

        System.out.print("Birth Date (dd.mm.yyyy): ");
        String birthDate = scanner.nextLine();
        Date birthdate = HRManagerUtil.formatter.parse(birthDate);

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Employment Date (dd.mm.yyyy): \n");
        String employmentDate = scanner.nextLine();
        Date employmentdate = HRManagerUtil.formatter.parse(employmentDate);

        Employee employee = new Employee(prename, surname, jobDescription, birthdate, salary, employmentdate);
        db.addEmployee(employee);

        System.out.println("Employee added successfully.\n");
    }

    /**
     * Show the interface to edit a employee to the db
     */
    public void showEditEmployee() throws ParseException {
        //TODO: implement
        System.out.println("------ Edit Employee ------");

        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();

        Employee employee = (Employee) db.getEmployees(employeeId);
        if (employee != null) {
            System.out.println("Enter updated employee details:");

            System.out.print("First Name: ");
            String prename = scanner.nextLine();

            System.out.print("Last Name: ");
            String surname = scanner.nextLine();

            System.out.print("Job Description: ");
            String jobDescription = scanner.nextLine();

            System.out.print("Birth Date (dd.mm.yyyy): ");
            String birthDate = scanner.nextLine();
            Date birthdate = HRManagerUtil.formatter.parse(birthDate);

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Employment Date (dd.mm.yyyy): \n");
            String employmentDate = scanner.nextLine();
            Date employmentdate = HRManagerUtil.formatter.parse(employmentDate);

            employee.setPrename(prename);
            employee.setSurname(surname);
            employee.setJobDescription(jobDescription);
            employee.setBirthdate(birthdate);
            employee.setSalary(salary);
            employee.setEmploymentDate(employmentdate);

            db.updateEmployee(employee);
            System.out.println("Employee updated successfully.\n");
        } else {
            System.out.println("Employee not found.\n");
        }
    }


    /**
     * Show the list of all employees from the db
     */
    public void showListEmployees() {
        //TODO: implement

    }

    /**
     * Show the interface to delete a employee
     */
    public void showDeleteEmployee() {
        //TODO: implement
    }

    /**
     * Internal method to print out a employee
     * @param employee to show
     */
    private void showEmployee(Employee employee) {
        //TODO: implement
    }

}
