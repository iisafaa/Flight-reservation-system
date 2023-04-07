/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alaas
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read=new Scanner (System.in);
         
            ArrayList<Employee> staff =new ArrayList ();
           
           try{
            File file=new File("staff.txt");
              Scanner output =new Scanner(file);
            
               //read from file
                String junk=output.nextLine(); 
                
                //عبينا الاوبجكيت من الفايل
                for (int i = 0; i <3; i++) {
                staff.add(new  Employee(output.next(),output.next(),output.next(),output.nextLong(),output.next(),output.nextDouble()));
                  }
                 output.close(); 
             
               }
              catch(IOException ex)
                {System.out.println(ex);}
             
           
               
                // to print employee informaion 
                   for (Employee st : staff) {
                     System.out.println(st);
            
                  }
                  
        
               // نطلب من اليوزر يدخل الاسم والايدي
               System.out.println("Please enter your name: ");
                 String name=read.next();
               System.out.println("Please enter your ID: ");
                  int id= read.nextInt();
                  
                  
               //نقارن اذا الإسم والايدي اللي دخله اليوزر موجود في الكوليكشن  او لا
                String x= staff.get(0).getName();
                String y= staff.get(1).getName();
                String z= staff.get(2).getName();
                
               while (!name.equals(x)&&!name.equals(y)&&!name.equals(z))
               {
                   System.out.println("wrong");
                   System.out.println("Please enter your name again: ");
                   name=read.next();
               }
               
               
         ArrayList<Flight> vee = new ArrayList(); 
         //ArrayList<pass> p = new ArrayList();  
         Company c=new Company(vee);
   
       
            c.fillFlight();
          
      
      
       loop:
          while(true){     
            int num;
                System.out.println("\n\t\t\t\tselection screen\n\t\t\t\t---------------------- ");
                System.out.println("\t\t\t\t1.Passenger Selection Screen\n\t\t\t\t2.Flight Selection Screen\n\t\t\t\t3.Exite");
                System.out.print("\t\t\t\tplease Enter number to choise: ");
          
                 num=read.nextInt();
          while (num<=0 || num>=4){ //if user inter wrong chioc
              
                System.out.println("wrong choise!! please Enter number again: ");
                  num=read.nextInt();
                }
            
           switch(num){
            case 1:
                
                loop1:
                while(true){
                  System.out.println("\n*****Welcome what you want to do  ?***** \n\nchoose 1 to Show services available for each class \nchoose 2 to Reserve a flight   \nchoose 3 to Print the Passenger information \nchoose 4 to Calculate the cost of passenger flights  \nchoose 5 to Back to the main Screen\n");
                 System.out.print("\tEnter your choice: "); 
                  int ch1 = read.nextInt();
                  
                  while(ch1>5){
           System.out.println("Wrong choice .... you must choose from 1 to 4 or choose 5 to Back to the main Screen");
                  System.out.print("Enter your choice: ");
                  ch1 = read.nextInt();
           }
                   System.out.println("________________________________________________________________");
                  switch(ch1){
                      case 1:
                          FlightClass[] fc = {new FirstClass(), new BusiClass(), new EconomyClass()};
                          System.out.println("\nChoose 1 to display first-class services\nChoose 2 to display Business-Class services\nChoose 3 to display Economy-Class services");
                          System.out.print("\n\tEnter your choice: ");
                          int d = read.nextInt();
                           
                          while (d > 3) {
                              System.out.println("Wrong choice .... you must choose from 1 to 3 ");
                              System.out.print("\tEnter your choice: ");
                              d = read.nextInt();
                                
                          }
  
                          if (d == 1) 
                              fc[0].Services();
                           else if (d == 2) 
                              fc[1].Services();
                           else 
                              fc[2].Services();
                          
                          break;
                          
                      case 2:
                          System.out.println("******Flight Schedule******\n");
                          for (int i = 0; i < c.getFlightres().size(); i++) {
                              System.out.println(c.getFlightres().get(i));
                          }   
                          System.out.println("\nwhich Flight do you want? ");
                          String noFlight = read.next();
                          for (Flight b : vee) {
                              if (b.getNumber().equals(noFlight)) {
                                  b.Fillpass();
                                  break;

                              }
                          }

                          break;
                      
                      case 3:
                 
                 //to search and print passenger informaions
                 System.out.println("----------------------------------");
                 System.out.println("Enter your ID number to print your information: ");
                 String ID=read.next();
                 System.out.println("----------------------------------");
                   
                              for (Flight b : vee) {
                                for (pass p1 : b.getBusiClass()) {
                                  if (p1.getID().equals(ID)) {
                                      System.out.println(p1);

                                  }
                              }
                          }

                          for (Flight b : vee) {
                              for (pass p1 : b.getEconomyClass()) {
                                  if (p1.getID().equals(ID)) {
                                      System.out.println(p1);

                                  }
                              }
                          }

                          for (Flight b : vee) {
                              for (pass p1 : b.getFirstClass()) {
                                  if (p1.getID().equals(ID)) {
                                      System.out.println(p1);

                                  }
                              }
                          }

                        break; 
            
            
            case 4 :
                double pricE=0,pricF=0,pricB=0;  
                System.out.println("----------------------------------");
                 System.out.println("Enter your ID number to calculate your cost: ");
                 String ID1=read.next();
                 System.out.println("----------------------------------");
                             
                              for (Flight b : vee) {
                                for (pass p1 : b.getBusiClass()) {
                                  if (p1.getID().equals(ID1)) 
                                      pricB=b.getPrice()+pricB; 

                                  
                              }
                          }

                          for (Flight b : vee) {
                              for (pass p1 : b.getEconomyClass()) {
                                  if (p1.getID().equals(ID1)) 
                                       pricE=b.getPrice()+pricE;

                                  
                              }
                          }

                          for (Flight b : vee) {
                              for (pass p1 : b.getFirstClass()) {
                                  if (p1.getID().equals(ID1)) 
                                        pricF=b.getPrice()+pricF;

                                  
                              }
                          }
                          
                          System.out.println("You have to pay "+(pricF+pricE+pricB)+" S.R");
                break;
                
                 case 5:
                 break loop1;
                  }//blook small switch
                }////blook small while
                 
                break; //break cas1
                
              // End case 1
            case 2:
                loop2:
                 while(true){
                 System.out.println("\n*****Welcome what you want to do  ?***** \n\nchoose 1 to Add Flight  \nchoose 2 to Print the Flight information  \nchoose 3 to Find the passenger flight \nchoose 4 to Back to the main Screen\n");
                 System.out.print("\tEnter your choice: "); 
                  int ch = read.nextInt();
                  
                  while(ch>4){
           System.out.println("Wrong choice .... you must choose from 1 to 3 or choose 4 to Back to the main Screen");
                  System.out.print("Enter your choice: ");
                  ch = read.nextInt(); }
               System.out.println("________________________________________________________________");
                  switch(ch){
                      case 1:
                          c.addFlight();
                          break;
                      case 2:
                          
                          boolean flag=true;
                         System.out.print("Enter The flight number : ");
                         String flnum=read.next();
                         for(Flight b : vee){
                             if(b.getNumber().equals(flnum)){
                                  System.out.println(b);
                flag=false;
                             }
                         }
     
                       if(flag)
                          System.out.println("We cannot find a flight");
                       break;
                  
            case 3:
                                 boolean flag2=true;
                         System.out.print("Enter your ID : ");
                         String pasnum=read.next();
                         for(Flight b : vee){
                             for(pass b2 : b.getBusiClass()){
                                 if(b2.getID().equals(pasnum)){
                                     System.out.println(b);
                                              flag2=false;}
                             }
                             
                                  for(pass b2 : b.getEconomyClass()){
                                 if(b2.getID().equals(pasnum)){
                                     System.out.println(b);
                                   flag2=false;}
                             }
                                       for(pass b2 : b.getFirstClass()){
                                 if(b2.getID().equals(pasnum)){
                                     System.out.println(b);  
                                     flag2=false;
                                 }
                             }
                                 
                         }
                            if(flag2)
                          System.out.println("We cannot find a person");
  
               break;
           
          
           case 4:
               break loop2;
              
                 
                }//blook sitch case 2
            }//blook while case 2
          break; //break case 2

       
            case 3:
                System.out.println("Thank you");
                break loop; // break big switch 
    }  // blook big switch 
  }  //blook big while   
       

    
    }
    
}
