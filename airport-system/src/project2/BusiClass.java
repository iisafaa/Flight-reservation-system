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
public class BusiClass extends pass implements FlightClass{
    
    
    public BusiClass(String name, String ID, String passport_no, String[][] table) {
        super(name, ID, passport_no, table);
    }
      public BusiClass() {
          super();
    }
    
      public void Services(){
          
          System.out.println("\n[Full flat bed]");
          System.out.println("[Large dining table]");
          System.out.println("[A touch screen control gives the passenger full control of the seat]");
          
      }
          public String toString() {
         return super.toString()+"\nclass : Business";
     }
    
}
