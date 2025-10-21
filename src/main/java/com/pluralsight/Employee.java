package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    //employeeId, name, department, payRate, hoursWorked
    private int employeeID;
    private String name;
    private String department;
    private float hoursWorked;
    private double payRate;

    public int Employee (int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeID = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * 1.5 * payRate );
    }
    public double getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float OvertimeHours(){
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    private double punchInTime = 0;

    public void punchIn(double time){
        this. punchInTime = time;
//        LocalTime lt = LocalTime.now();
//        int hours = lt.getHour();
//        int minutes = lt.getMinute();
//        double timeAsDouble = hours + ((double) minutes / 60);
//
//        this.punchInTime = timeAsDouble;

        LocalTime lt = LocalTime.now();
        this.punchInTime = lt.getHour() + ((double) lt.getMinute() / 60);
    }


    public void punchOut(double time){
        //double elapsedTime = time - this.punchInTime;
        //this.hoursWorked + = (float) elapsedTime;

        this.hoursWorked += (float) (time- this.punchInTime);


    }

    public void punchOut() {
//        LocalTime lt = LocalTime.now();
//        double punchOutAsDouble =  lt.getHour() + ((double) lt.getMinute() / 60);
//        this.hoursWorked += (float) (punchOutAsDouble - this.punchInTime);

        LocalTime lt = LocalTime . now();
        this.hoursWorked += (float)  (lt.getHour() + ((double) lt.getMinute() / 60) - this.punchInTime);
    }


    public void punchTimeCard(double checkInTime, double checkOutTime){
        this.hoursWorked += (float) (checkOutTime - checkInTime);



    }

    public void logHours(float hours) {
        this.hoursWorked += hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                ",getTotalPay()=" + getTotalPay() +
                ",getRegularHours()" + getRegularHours() +
                ",getOvertimeHours()=" + getOvertimeHours() +
                '}';
    }
}