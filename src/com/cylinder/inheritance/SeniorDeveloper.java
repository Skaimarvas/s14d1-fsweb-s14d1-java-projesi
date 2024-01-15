package com.cylinder.inheritance;

public class SeniorDeveloper extends Employee  {

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer: " + getName() + " starts to coding. Salary is updated: " + getSalary());
        setSalary(getSalary() + 2000);
    }
}
