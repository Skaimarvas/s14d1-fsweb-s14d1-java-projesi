package com.cylinder.inheritance;

public class MidDeveloper extends Employee{

    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 1000);
        System.out.println("Mid Developer: " + getName() + " starts to coding. Salary is updated: " + getSalary());

    }
}
