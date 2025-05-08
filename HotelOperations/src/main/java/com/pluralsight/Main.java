package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //testReservation1();
        testEmployee();
    }

    public static void testReservation1() {
        Reservation r1 = new Reservation("king", 1, false);
        System.out.println(r1.getPrice());
        Reservation r2 = new Reservation("double", 1, false);
        System.out.println(r2.getPrice());
        Reservation r3 = new Reservation("king", 1, true);
        System.out.println(r3.getPrice());
        Reservation r4 = new Reservation("double", 1, true);
        System.out.println(r4.getPrice());
    }

    public static void testEmployee() {
        Employee e1 = new Employee(1, "Jerry", "facilitator", 10);
        e1.setHoursWorked(39); //this will be changed when you add punch in and punch out
        System.out.println(e1.getTotalPay());

        Employee e2 = new Employee(1, "Tom", "facilitator", 10);
        e2.setHoursWorked(40); //this will be changed when you add punch in and punch out
        System.out.println(e2.getTotalPay());

        Employee e3 = new Employee(1, "William", "facilitator", 10);
        e3.setHoursWorked(41); //this will be changed when you add punch in and punch out
        System.out.println(e3.getTotalPay());
    }
}