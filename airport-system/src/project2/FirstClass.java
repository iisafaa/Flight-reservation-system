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
public class FirstClass extends pass implements FlightClass{
    
      

    public FirstClass(String name, String ID, String passport_no, String[][] table) {
        super(name, ID, passport_no, table);
    }
      public FirstClass() {
          super();
    }
    
    public void Services(){
        System.out.println("\n[Wi-Fi service]");
        System.out.println("[We offer you a full four course meal inside your first suite]");
        System.out.println("[Prepare your comfortable bed with fluffy bedding and fluffy pillows]");
       

    
    }
              public String toString() {
         return super.toString()+"\nclass : First";
     }
    
}
