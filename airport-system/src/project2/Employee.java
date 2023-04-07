/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author alaas
 */
public class Employee {
    private String name;
    private String ID;
    private String address;
    private long mobile_number;
    private String email;  
    private double salary;

    public Employee(String name, String ID, String address, long mobile_number, String email, double salary) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.mobile_number = mobile_number;
        this.email = email;
        this.salary = salary;
    }

    public Employee() {
        this.name = "none";
        this.ID = "none";
        this.address = "none";
        this.mobile_number = 0;
        this.email = "none";
        this.salary = 0;
    }
     
    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(long mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID (String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" + "name= " + name + ", ID= " + ID + ", address= " + address + ", mobile_number= " + mobile_number + ", email= " + email + ", salary= " + salary + '}';
    }

   
    
    
    
}
