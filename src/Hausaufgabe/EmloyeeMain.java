package Hausaufgabe;

import java.util.List;

public class EmloyeeMain {
    public static void main(String[] args) {
        //создаем объекты
        Employee lelik = new Employee("Lelik", 50000, 1987,11,25);
        Employee bolik = new Employee("Bolik", 75000, 1980,5,14);
        Employee goga = new Employee("Goga", 80000, 1982, 3,9);
        Employee boss = new Employee("Lelik", 100000, 1981,4,1);



        // создаем массив на 4 объекта
        Employee[] employees = new Employee[4];

        //заполняем массив тремя объектами

        employees[0] = lelik;
        employees[1] = boss;
        employees[2] = bolik;
        employees[3] = goga;

//        employees[0] = new Employee("Lelik", 50000, 1987,11,25);
//        employees[1] = new Employee("Bolik", 75000, 1980,5,14);
//        employees[2] = new Employee("Goga", 80000, 1982, 3,9);

        // вывод на экран всех работников до повышения зарплаты

//        for (Employee e : employees){
//            e.setId();
//            System.out.println("Name = " + e.getName() + ", Salary = " + e.getSalary() + ", HireDay = " + e.getHireDay() + ", id = " + e.getId());
//        }
//        int n = Employee.getNextId();
//        System.out.println("Next available ID = " + n);
//        //поднять зарплату всем работникам на 5%
//
//        for(Employee e : employees){
//            e.raiseSalary(5);
//        }
//        // вывод на экран всех работников после повышения зарплаты
//
//
//        System.out.println("Posle");
//        for (Employee e : employees){
////            e.setId();
//            System.out.println("Name = " + e.getName() + ", Salary = " + e.getSalary() + ", HireDay = " + e.getHireDay() + ", id = " + e.getId());
//        }
//        System.out.println("==========================================================");
//
//        if (lelik.equals(bolik)) {
//            boss.setSalary(lelik.getSalary());
//        }else{
//            lelik.setSalary(10000);
//        }
//
//
//        for (Employee e : employees){
//            System.out.println("Name = " + e.getName() + ", Salary = " + e.getSalary() + ", HireDay = " + e.getHireDay());
//        }
        double persent = 10;
        lelik.raiseSalary(TripliProz(persent));
        System.out.println("lelik.getSalary() = " + lelik.getSalary());

        System.out.println("persent = " + persent);

        TripliProz1(persent);

        System.out.println("persent = " + persent);

        System.out.println("lelik = " + lelik);
        System.out.println("bolik = " + bolik);
        System.out.println("boss = " + boss);
        System.out.println("===========================");
        swap(lelik,bolik);

        System.out.println("lelik = " + lelik);
        System.out.println("bolik = " + bolik);
        System.out.println("boss = " + boss);




    }
    public static double TripliProz(double x){
       return x = 3*x;
    }

    public static void TripliProz1(double x){
        x = 3*x;
    }

    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x=y;
        y=temp;
    }
}
