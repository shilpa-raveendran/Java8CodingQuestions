package com.shilpa;

public class Employee {

    private String empName;
    private Integer empId;
    private double salary;

    private int age;


    public Employee(String empName, Integer empId, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public Employee(String empName, Integer empId, double salary, int age) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
