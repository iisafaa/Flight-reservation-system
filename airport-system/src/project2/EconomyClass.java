/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author wessal
 */
public class EconomyClass extends pass implements FlightClass {

    public EconomyClass(String name, String ID, String passport_no, String[][] table) {
        super(name, ID, passport_no, table);
    }
    
      
      public EconomyClass() {
          super();
    }
      
      public void Services(){
          System.out.println("\n[We offer a variety of Arabic and Western dishes]");
          System.out.println("[All guest class seats are equipped with special displays]");
          System.out.println("[The free gift bags provide sleeping sets for all passengers to meet their personal needs during the flight]");
      }
     public String toString() {
         return super.toString()+"\nclass : Economy";
     }
   } 

