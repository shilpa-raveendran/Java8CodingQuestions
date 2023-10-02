package com.shilpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeRunner {

    public static void main(String[] args) {

        Employee emp1 = new Employee("John", 1, 1000.50);
        Employee emp2 = new Employee("Matt", 2, 2000);
        Employee emp3 = new Employee("Tom", 3, 3299);
        Employee emp4 = new Employee("Joe", 4, 2000);
        Employee emp5 = new Employee("Mathew", 5, 5600);
        Employee emp6 = new Employee("Aby", 6, 2500);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);

        //Sort employees based on their salaries desc
        System.out.println("========Desc order========");
        employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(System.out::println);

        System.out.println("========Ascending Order========");
        employeeList.stream()
                .sorted((s1,s2) -> (int) (s1.getSalary() - s2.getSalary()))
                .forEach(System.out::println);

        System.out.println("========Desc order========");
        employeeList.stream()
                .sorted((s1,s2) -> (int) (s2.getSalary() - s1.getSalary()))
                .forEach(System.out::println);


        System.out.println("========Top 3 salaried========");
        employeeList.stream()
                .sorted(( s1, s2) ->(int) (s2.getSalary() - s1.getSalary()))
                .limit(3).forEach(System.out::println);

        System.out.println("========Employee less than 3rd highest salary========");
        employeeList.stream()
                .sorted(( s1, s2) ->(int) (s2.getSalary() - s1.getSalary()))
                .skip(3).forEach(System.out::println);
    }
}
