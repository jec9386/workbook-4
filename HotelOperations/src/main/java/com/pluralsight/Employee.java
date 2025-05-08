package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employee(int employeeID, String name, String department, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        //hours worked removed because that is going to be determined depending on check in and checkout times
    }

    public int getEmployeeID() {
        return employeeID;
    }

    //dont want employee ID to be able to be changed

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

   //dont want them to be able to change the hours they worked, will cover this later with check in and check out
    public void setHoursWorked(float hoursWorked){
        this.hoursWorked = hoursWorked;
    }



    public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }

    public float getRegularHours(){
        if(hoursWorked > 40){
            return 40;
        }else{
            return hoursWorked;
        }
    }

    public float getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }else{
            return 0;
        }
        //tertiary operator- return(hoursWorked > 40) ? hoursWorked -40 : 0;
    }

    //need to remember the punch in, so create a variable to put it.
    private double punchInTime;


    public void punchIn(double time){
        this.punchInTime = time;
    }

    public void punchOut(double time){
        this.hoursWorked += (time - this.punchInTime);
    }

}