package myfirstapp;

public class Employee{
    private String name;
    private int    employeeId;

    public Employee(String name, int employeeId){
        this.name       = name;
        this.employeeId = employeeId;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.employeeId;
    }
}