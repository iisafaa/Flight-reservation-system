/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.*;

/**
 *
 * @author wessal
 */
public class Company {

    Scanner keyboard=new Scanner (System.in);
   
  //سوينا رحلات عشوائية من عندنا
    
     ArrayList <Flight> flightres = new ArrayList();
     
    
     
    public Company(  ArrayList <Flight> flightres ) {
        this.flightres = flightres;
    }

    public Company() {
    }


    public ArrayList<Flight> getFlightres() {
        return flightres;
    }

    public void setFlightres(ArrayList<Flight> flightres) {
        this.flightres = flightres;
    }
    
   public void fillFlight() {
   Flight f1=new Flight("1001" ,"Jeddah","dammam","2",500); 
   Flight f2=new Flight("1002" ,"Jeddah","Riyadh","1",200); 
   Flight f3=new Flight("1003" ,"Jeddah","Madinah","2",300); 
      flightres.add(f1);
      flightres.add(f2);
      flightres.add(f3);
}
        
   public void addFlight() {
     String number;
   String origin_city;
    String destination_city;
    String flight_duration;
    int price;
            System.out.print("Enter the Flight number : ");
            number=keyboard.next();
             System.out.print("Enter the origin city : ");
            origin_city=keyboard.next();
              System.out.print("Enter the destination city : ");
             destination_city=keyboard.next();
              System.out.print("Enter the flight duration: ");
              flight_duration=keyboard.next();
               System.out.print("Enter the flight price : ");
                price=keyboard.nextInt();
            
 
 
      flightres.add(new Flight(number ,origin_city,destination_city,  flight_duration, price) );
        
        }
    
    @Override
    public String toString() {
        return "Company{" + "flightres= " + flightres + '}';
    } 
    
    
    
    
    
    
    
    
    


   
    
    
    
    
   

}
