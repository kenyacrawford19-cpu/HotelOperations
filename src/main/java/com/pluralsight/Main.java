package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Rooms are new: ");

        ArrayList<Room> rooms = new ArrayList<>();

        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(2);
        Room r104 = new Room(2);

        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);

        for (Room r : rooms) {
            System.out.println(r);
        }
        //------------------

        //-
        System.out.println("Rooms have 2 checked out:");

        r101.checkIn();
        r102.checkIn();

        for (Room r : rooms) {
            System.out.println(r);
        }

        System.out.println("One room checked out");

        r102.checkout();
      System.out.println(r);
    }

    //-------------------

    ArrayList<Reservation> reservations = new ArrayList<>();

    Reservation res1 = new Reservation("king", 2,  false);
    Reservation res2 = new Reservation("double" , 1, false);
    Reservation res3 = new Reservation("king" , 1, false);
    Reservation res4 = new Reservation("king", 1, false);

    reservations.add(res1);
    reservations.add(res2);
    reservations.add(res3);
    reservations.add(res4);

    for(static Reservation r : reservations) {
        System.out.println(r);
    }

    //---------


    ArrayList<Employee> employees = new ArrayList<>();
    System.out.println("before");

    Employee emp1 = new Employee(1,"Matt" , "IT", 10 , 0);
    Employee emp2 = new Employee(1, "Fred", "Exec" , 10,0);
    Employee emp3 = new Employee(1, "Sarah" , "HR" , 10,40);
    Employee emp4 = new Employee(1, "Sam" , "HR" , 20,41);

    employees.add(emp1);
    employees.add(emp2);
    employees.add(emp3);
    employees.add(emp4);

    for(Employee e : employees) {
        System.out.println(e);
    }

    //-------
    emp1.punchIn(8);
    emp1.punchOut(12);

    emp1.punchIn(13);
    emp1.punchOut(17);

    emp1.punchTimeCard(8,12);
    emp1.punchTimeCard(13,17);

    emp1.logHours(40);

    emp2.punchIn(8);
    emp2.punchOut();

        System.out.println("after");

        for(Employee e : employees)


        System.out.println(e);

}
