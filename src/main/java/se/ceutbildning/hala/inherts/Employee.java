package se.ceutbildning.hala.inherts;

import java.time.LocalDate;

public abstract class Employee {
    private int id;
    private String name;
    private String salary;
    private LocalDate dateHired;

    public Employee(int id, String name, String salary){
        this.id= id;
        this.name= name;
        this.salary= salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }


    public abstract void calculateSalary();
}
