package model;

//Determine the department (Technical, Admin, Human Resource, Legal)
public class SuperDepartment {
    //private String departmentName;

    // public Department(String departmentName) {
    //     super();
    //     this.departmentName = departmentName;
    // }

    public String departmentName() {
        return "Super Department";
    }

    public String getTodaysWork() {
        return "No Work as of now";
    }

    public String getWorkDeadline() {
        return "Nil";
    }

    public static String isTodayAHoliday() {
        return "Today is not a holiday";
    }

}
