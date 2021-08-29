package model;


public class Employee {
    private String firstName;
    private String  lastName;

    public void setFirstName(String fn)  {
        this.firstName = fn;

    } 

    public void setLastName(String ln)  {
        this.lastName = ln;

    } 

    public String getLastName()  {
        return this.lastName ;

    } 
    
    public String getFirstName()  {
        return this.firstName;

    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    } 

    

    
}
