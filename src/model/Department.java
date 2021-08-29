package model;

//Determine the department (Technical, Admin, Human Resource, Legal)
public class Department {
    private String departmentName;

    public Department(String departmentName) {
        super();
        this.departmentName = departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

}
