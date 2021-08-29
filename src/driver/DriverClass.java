package driver;

import java.util.Scanner;

import model.Department;
import model.Employee;
import service.CredentialService;

public class DriverClass {

    public static void main(String[] args) {
        Employee employee = new Employee("Abhishek", "Solanki");
        CredentialService credentialService = new CredentialService();
        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical \n2. Admin \n3. HR  \n4. Legal");

        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();

        switch (choice) {
            case 1:
                Department department1 = new Department("tech");
                credentialService.showCredential(employee, department1);
                break;
            case 2:
                Department department2 = new Department("admin");
                credentialService.showCredential(employee, department2);
                break;

            case 3:
                Department department3 = new Department("hr");
                credentialService.showCredential(employee, department3);
                break;

            case 4:
                Department department4 = new Department("legal");
                credentialService.showCredential(employee, department4);
                break;

            default:
                System.out.println("Please enter number between 1 to 4");

        }
    }
}
