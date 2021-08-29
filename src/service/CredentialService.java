package service;

import java.util.Random;
import model.Department;
import model.Employee;


//1. generate random character of length 8
//2. generate email 
public class CredentialService {
    private char[] generatePassword(){
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";

      Random random = new Random();
      
      char [] password = new char [8];

      for(int i=0; i<2; i++){
          password[(4*i)] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length())); 
          password[1+(4*i)] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
          password[2+(4*i)] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
          password[3+(4*i)] = numbers.charAt(random.nextInt(numbers.length())); 
      }

      return password;
    }

    private String generateEmail(Employee employee, Department department) {
      String email = employee.getFirstName() + employee.getLastName() + '.' + department.getDepartmentName()
              + "@email.com";
      return email;
  }

    public void showCredential(Employee employee, Department department){
      System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
      System.out.println("Email --> " + generateEmail(employee, department) );
      System.out.print("Password --> ");
      System.out.println(generatePassword());
    }

}
