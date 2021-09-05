package driver;

import java.util.Scanner;

import model.AdminDepartment;
import model.HrDepartment;
import model.SuperDepartment;
import model.TechDepartment;

public class DriverClass {

    public static void main(String[] args) {
        HrDepartment HrDepartment = new HrDepartment();
        TechDepartment TechDepartment = new TechDepartment();
        AdminDepartment AdminDepartment = new AdminDepartment();
        SuperDepartment superDepartment = new SuperDepartment();

        System.out.print("Welcome to ");
        System.out.println( AdminDepartment.departmentName());
        System.out.println(AdminDepartment.getTodaysWork());
        System.out.println(AdminDepartment.getWorkDeadline());
        System.out.println(AdminDepartment.isTodayAHoliday() + "\n");

        System.out.print("Welcome to ");
        System.out.println(HrDepartment.departmentName());
        System.out.println(HrDepartment.getTodaysWork());
        System.out.println(HrDepartment.getWorkDeadline());
        System.out.println(HrDepartment.isTodayAHoliday()+ "\n");

        System.out.print("Welcome to ");
        System.out.println(TechDepartment.departmentName());
        System.out.println(TechDepartment.getTodaysWork());
        System.out.println(TechDepartment.getWorkDeadline());
        System.out.println(TechDepartment.isTodayAHoliday()+ "\n");

        

    }

}
