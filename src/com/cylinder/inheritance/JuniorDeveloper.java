package com.cylinder.inheritance;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 500);
        System.out.println("Junior Developer: " + getName() + " starts to coding. Salary is updated: " + getSalary());

    }
}
