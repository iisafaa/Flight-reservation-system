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
public class pass {
    String name;
    String ID;
    String passport_no;
    String[][]table; 

    public pass(String name, String ID, String passport_no,String[][]table) {
        this.name = name;
        this.ID = ID;
        this.passport_no = passport_no;
        this.table=table;
    }
      public pass() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getPassport_no() {
        return passport_no;
    }

    public String[][] getTable() {
        return table;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return  "*** passnger ***" + "\nname : " + name + "\nID : " + ID + "\npassport number : " + passport_no + "\nFlight number : " +table[0][0] +"\nset number : "+table[0][1] ;
    }

    
  
    
}
