package com.cylinder.inheritance;

public class HRManager extends Employee {
   private Employee[] juniorDeveloper;
   private Employee[] midDeveloper;
   private Employee[] seniorDeveloper;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDeveloper = new Employee[3];
        this.midDeveloper = new Employee[3];
        this.seniorDeveloper = new Employee[3];
    }

    public Employee[] getJuniorDeveloper() {
        return juniorDeveloper;
    }

    public void setJuniorDeveloper(Employee[] juniorDeveloper) {
        this.juniorDeveloper = juniorDeveloper;
    }

    public Employee[] getMidDeveloper() {
        return midDeveloper;
    }

    public void setMidDeveloper(Employee[] midDeveloper) {
        this.midDeveloper = midDeveloper;
    }

    public Employee[] getSeniorDeveloper() {
        return seniorDeveloper;
    }

    public void setSeniorDeveloper(Employee[] seniorDeveloper) {
        this.seniorDeveloper = seniorDeveloper;
    }

    public void addEmployee(JuniorDeveloper junior){
        addEmployee(junior, juniorDeveloper);
    }

    public void addEmployee(MidDeveloper mid){
        addEmployee(mid, midDeveloper);
    }

    public void addEmployee(SeniorDeveloper senior){
        addEmployee(senior, seniorDeveloper);
    }

    private void addEmployee(Employee employee, Employee[] employees){
        for(int i = 0; i < employees.length; i++){
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.println(employee.getName() + " was added to team");
                return;
            } else {
                System.out.println("Warning! " + i + " is already occupied. Please try other index number.");
            }


        }
        System.out.println("There is no more empty index");
    }

    @Override
    public void work() {
        System.out.println("HRManager " + getName() + " starts to manage developer team");
    }
}
