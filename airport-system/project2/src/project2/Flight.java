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
public class Flight {
   private String number;
   private String origin_city;
   private String destination_city;
   private String flight_duration;
   private int price;
  // private ArrayList <pass> pas;
   private ArrayList <pass> EconomyClass=new ArrayList<>() ;
   private ArrayList <pass> BusiClass= new ArrayList<>(); 
   private ArrayList <pass> FirstClass = new ArrayList<>();
   
   
   
   
    Scanner keyboard=new Scanner (System.in);
   
 

    public Flight(String number, String origin_city, String destination_city, String flight_duration, int price) {
        this.number = number;
        this.origin_city = origin_city;
        this.destination_city = destination_city;
        this.flight_duration = flight_duration;
        this.price = price;
    }
/*public Flight(String number, String origin_city, String destination_city, String flight_duration, int price,ArrayList <pass> pas) {
        this(number, origin_city, destination_city, flight_duration, price);
        this.pas=pas;
  } */ 
       
    
    public Flight() {
    }

    public String getNumber() {
        return number;
    }

    public String getOrigin_city() {
        return origin_city;
    }

    public String getDestination_city() {
        return destination_city;
    }

    public String getFlight_duration() {
        return flight_duration;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<pass> getEconomyClass() {
        return EconomyClass;
    }

    public void setEconomyClass(ArrayList<pass> EconomyClass) {
        this.EconomyClass = EconomyClass;
    }

    public ArrayList<pass> getBusiClass() {
        return BusiClass;
    }

    public void setBusiClass(ArrayList<pass> BusiClass) {
        this.BusiClass = BusiClass;
    }

    public ArrayList<pass> getFirstClass() {
        return FirstClass;
    }

    public void setFirstClass(ArrayList<pass> FirstClass) {
        this.FirstClass = FirstClass;
    }

   /* public ArrayList<pass> getPas() {
        return pas;
    }*/

     /*public void setPas(ArrayList<pass> pas) {
       this.pas = pas;
    }*/
    public void setNumber(String number) {
        this.number = number;
    }

    public void setOrigin_city(String origin_city) {
        this.origin_city = origin_city;
    }

    public void setDestination_city(String destination_city) {
        this.destination_city = destination_city;
    }

    public void setFlight_duration(String flight_duration) {
        this.flight_duration = flight_duration;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
    
    //**** fill pasnger
    public  void Fillpass(){
          
     // pass pas = new pass();
     // Company c=new Company();
      
     
            System.out.println("\n*****Which class do u want ?***** \n\nchoose 1 for Economy class \nchoose 2 for Business class \nchoose 3 for First class \nchoose 4 to Exit\n");
            System.out.print("\tEnter your choice: "); 
                  int num = keyboard.nextInt();

       while(num>4){
           System.out.println("Wrong choice .... you must choose from 1 to 3 or choose 4 to exit");
                  System.out.print("Enter your choice: ");
                  num = keyboard.nextInt();
       }
       String name;
       String ID;
        String passport_no;
        String set;
        switch(num){
            case 1:
                
                System.out.print("Enter your name : ");
                  name=keyboard.next();
               System.out.print("Enter your ID : ");
                  ID=keyboard.next();
                  System.out.print("Enter your passport number : ");
                passport_no=keyboard.next();
                System.out.print("Enter your set number from 1 to 3 : ");
                set=keyboard.next(); 
                String arr[][]={{this.number,set}};  
             this.EconomyClass.add(  new EconomyClass(name,ID,passport_no,arr));
                 
                 break;
            case 2 :
                System.out.print("Enter your name : ");
                name=keyboard.next();
                 System.out.print("Enter your ID : ");
                  ID=keyboard.next();
                  System.out.print("Enter your passport number : ");
                  passport_no=keyboard.next();
                   System.out.print("Enter your set number from 4 to 6 : ");
                set=keyboard.next();
                String arr1[][]={{this.number,set}};
                this.BusiClass.add( new BusiClass(name,ID,passport_no,arr1)) ;
                 
                 break;
                case 3 : 
                 System.out.print("Enter your name : ");
                   name=keyboard.next();
                 System.out.print("Enter your ID : ");
                   ID=keyboard.next();
                 System.out.print("Enter your passport number : ");
                   passport_no=keyboard.next();
                 System.out.print("Enter your set number from 7 to 9 : ");
                   set=keyboard.next();
                String arr2[][]={{this.number,set}};
                 this.FirstClass.add(new FirstClass (name,ID,passport_no,arr2)) ;
                 
                 break;
                case 4 :
                    System.out.println("Thanks <3 ...");
                     break;
        }
       
    }
   

    @Override
    public String toString() {
        return ("\n*** Flight information***\n" + "flight number : " + number + "\norigin city : " + origin_city + "\ndestination city : " + destination_city + "\nflight duration : " + flight_duration + "\nprice : " + price );
    }
 
    
   
   
    
}
