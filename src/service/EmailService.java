package service;

import model.Department;
import model.Employee;

//THIS CLASS IS NOT CURRENTLY IN USE

//Generate an email with the following syntax
//firstNamelastName@department.company.com
public class EmailService {
    public String generateEmail(Employee employee, Department department) {
        String email = employee.getFirstName() + employee.getLastName() + '@' + department.getDepartmentName()
                + ".email.com";
        return email;
    }
}
