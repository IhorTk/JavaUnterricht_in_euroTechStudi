package Hausaufgabe;

import java.time.LocalDate;
import java.util.Date;

class Employee {
   //переменные экземпляра
   private static int nextId =1;
   private String name;
   private double salary;
   private LocalDate hireDay;
   private  int id;


   //конструктор
    public Employee(String n, double s, int year, int month, int day) {
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);
        id = 0;
    }


    //Методы
    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }
    public static int getNextId(){
        return nextId;
    }

    public void raiseSalary(double Percent){
        double reise = salary*Percent/100;
        salary += reise;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Employee other) {
        return name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDay=" + hireDay +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

