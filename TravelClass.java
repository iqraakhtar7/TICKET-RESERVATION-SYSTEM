/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ais_ticket_reservation_system;

import java.util.Scanner;
import javax.swing.JTextField;



/**
 *
 * @author Iqra Akhtar
 */
public class TravelClass extends TicketDetails implements Facilities  
{
    int SeatWidthinch=18;
    int SeatPitchinch=32;
    int TicketCost=8000;
    int TicketCostBusiness=12000;
    int TicketCostFirst=17000;
     @Override
    public void TicketCostOfTravelClasses(int select)
    {
        switch(select)
        {
            case 1:
                
                int a=TicketCost;
                CustomerData.PricePerPerson.setText(Integer.toString(a));
                System.out.println("TICKET COST OF 1 PERSON (economy)="+a);
               long z=Passenger()*a;
               CustomerData.totalPrice.setText(Long.toString(z));
                System.out.println("\nTOTAL COST: "+z);
               break; 
            
            
            case 2:
            
                 int b=TicketCost+4000;
                CustomerData.PricePerPerson.setText(Integer.toString(b));
                System.out.println("TICKET COST OF 1 PERSON (business)="+b);
                long v=Passenger()*b;
               CustomerData.totalPrice.setText(Long.toString(v));
                System.out.println("\nTOTAL COST: "+v);
              break;
            
            case 3:
            
                int c=TicketCost+7000;
                CustomerData.PricePerPerson.setText(Integer.toString(c));
            
                System.out.println("TICKET COST OF 1 PERSON (first class)="+c);
                
                long w=Passenger()*c;
               CustomerData.totalPrice.setText(Long.toString(w));
                System.out.println("\nTOTAL COST: "+w);
                 break;
            
            default:
                System.out.println("UNVALID ENTERY ; please select travel class again :");
                break;
        }
    }
   
    public void TicketCostOfTravelClasses(int select, JTextField PricePerPerson, JTextField totalPrice)
    {
        switch(select)
        {
            case 1:
                
                int a=TicketCost;
                PricePerPerson.setText(Integer.toString(a));
                System.out.println("TICKET COST OF 1 PERSON (economy)="+a);
               long z=Passenger()*a;
               totalPrice.setText(Long.toString(z));
                System.out.println("\nTOTAL COST: "+z);
               break; 
            
            
            case 2:
            
                 int b=TicketCost+4000;
                PricePerPerson.setText(Integer.toString(b));
                System.out.println("TICKET COST OF 1 PERSON (business)="+b);
                long v=Passenger()*b;
               totalPrice.setText(Long.toString(v));
                System.out.println("\nTOTAL COST: "+v);
              break;
            
            case 3:
            
                int c=TicketCost+7000;
                PricePerPerson.setText(Integer.toString(c));
            
                System.out.println("TICKET COST OF 1 PERSON (first class)="+c);
                
                long w=Passenger()*c;
               totalPrice.setText(Long.toString(w));
                System.out.println("\nTOTAL COST: "+w);
                 break;
            
            default:
                System.out.println("UNVALID ENTERY ; please select travel class again :");
                break;
        }
    }
    
     @Override
    public void DetailsOfClasses(String trvlclass)
       {
           switch(trvlclass)
           {
               case "economy":
            System.out.println("\nDESCRIPTION OF ECONOMY CLASS*");
            System.out.println("\n\n***AIRPORT LOUNGES***");
            System.out.println("\nyou will be provided with a comfortable lounge during a stay or for waiting incase of flight delaying :"
                  + "\n* lounge having dining facility"
                  + "\n* Branded Food for free"
                   + "\n* Branded Drinks for free");
            
             System.out.println("\n\n***MORE ***");
             System.out.println("\nmore facilities are provided including :"
                + "\n* swiveling TV screens, "
             + "\n* power for laptop"); 
             System.out.println("\n\n***FOOD+DRINKS***");
             System.out.println("\nPassengers enjoy:"
                + "\n* plenty of complimentary food"
                + "\n* alcoholic beverages"); 
    
            break;
            
            case "business":
               System.out.println("\nDESCRIPTION OF BUSINESS CLASS*");     
          System.out.println("\n\n***AIRPORT LOUNGES***");
          System.out.println("\nyou will be provided with a comfortable lounge during a stay or for waiting incase of flight delaying :"
                  + "\n* lounge having dining facility"
                  + "\n* Branded Food for free"
                   + "\n* Branded Drinks for free"
                  + "\n* shopping facility  "
                  + "\n* WI-FI availiblity");
         System.out.println("\n\n***MORE ***");
         System.out.println(" \nMovie on Demand,"
             + "\n* swiveling TV screens, "
             + "\n* power for laptop"
             + "\n* any amount of food and wine.");    
       
 
         System.out.println("\n\n***FOOD+DRINKS***");
         System.out.println("\npassengers are generally served higher quality meals:"
                 + "\n* any amount of food and wine");
            break;    
       
            case "first":
          System.out.println("\nDESCRIPTION OF FIRST CLASS*");
          System.out.println("\n\n***AIRPORT LOUNGES***");
          System.out.println("\nyou will be provided with a comfortable lounge during a stay or for waiting incase of flight delaying :"
                  + "\n* lounge having dining facility"
                  + "\n* Branded Food for free"
                  + "\n* Branded drinks for free"
                  + "\n* library corner"
                  + "\n* shopping facility "
                  + "\n* WI-FI availiblity");
        
         System.out.println("\n\n***MORE ***");
         System.out.println(" \nFirst class seats are actually enclosed with:"
                 + "\n* suite-like pods with workstations"
                 + "/n* TVs, privacy dividers and aisle access.\n");
         System.out.println("\n\n***FOOD+DRINKS***");
         System.out.println("\nFirst class passengers are generally served higher quality meals:" +
                "\n* Passengers enjoy plenty of complimentary food and alcoholic beverages" +
                "\n* wine and liquor than those in business class");
    
            break;
            
            default:
                System.out.println("UNVALID ENTERY ; please select travel class again :"); 
           }
    }
    @Override
    public void Seatsize(int SeatWidthinch,int SeatPitchinch)
    {
    System.out.println("\n\n***ABOUT SEATS***\nEconomy Class\n"
            + "comfortable seats are provided with:"
                + "/n* width of "+SeatWidthinch+
            "/n* pitch of" +SeatPitchinch); 
         System.out.println("\n\n***ABOUT SEATS***\n Business Class \n"
                  + "/n* width of "+(SeatWidthinch+8)+
            "/n* pitch of" +(SeatPitchinch+20)); 
           
         System.out.println("\n\n***ABOUT SEATS***\n First Class\n"
                  + "/n* width of "+(SeatWidthinch+16)+
            "/n* pitch of" +(SeatPitchinch+40)); 
               
    }
    
    public int getSeatWidthinch() 
    {
        return SeatWidthinch;
    }

    public void setSeatWidthinch(int SeatWidthinch) 
    {
        this.SeatWidthinch = SeatWidthinch;
    }

    public int getSeatPitchinch() 
    {
        return SeatPitchinch;
    }

    public void setSeatPitchinch(int SeatPitchinch)
    {
        this.SeatPitchinch = SeatPitchinch;
    }

    public int getTicketCost() 
    {
        return TicketCost;
    }

    public void setTicketCost(int TicketCost)
    {
        this.TicketCost = TicketCost;
    }

    @Override
    public String toString()
    {
        return "TravelClass{" + "SeatWidthinch=" + SeatWidthinch + ", SeatPitchinch=" + SeatPitchinch + ", TicketCost=" + TicketCost + '}';
    }
    public void test()
    {
        Airline a=new Airline();
        a.start();
    }
       Scanner type=new Scanner(System.in);
       
      public int Passenger ()
      {
          System.out.println("\n\n Press 1 if u have only adults\n"
                  + " press 2 if u have adults along with children\n"
                  + " press 3 if u have adults along with infants\n"
                  + " press 4 if u have adults along with children and infants both");
          
          
          int no = 0;
          
          if(DataForm.Childrens.getSelectedIndex()==0 && DataForm.Infants.getSelectedIndex()==0)
              no=1;
          else if(DataForm.Infants.getSelectedIndex()==0)
              no=2;
          else if(DataForm.Childrens.getSelectedIndex()==0)
              no=3;
          else
              no=4;
          
        switch (no) {
            case 1:
            {
                
                TravelClass A = new TravelClass();
                
                int c= A.Adults();
                System.out.println("Total seats are " +c);
                return c;
                
            }
            case 2:
            {
                Customer B = new Customer();
                int c=B.Adults()+B.Children();
                System.out.println("Total seats are " +c);
                return c;
            }
            case 3:
            {
                Customer C = new Customer();
                int c=C.Adults()+C.Children();
                System.out.println("Total seats are " +c);
                return c;
                
            }
            case 4:
            {     Customer D = new Customer();
            int c=D.Adults()+D.Children()+D.Infants();
            System.out.println("Total seats are " +c);
            return c;
            
            
            }
            default:
                System.out.println("wrong entery");
                return 0;
        }
    
      }
      public int Adults ()
      {
             System.out.println("How many adluts are with you?");
             int num = DataForm.Adults.getSelectedIndex()+1;
             return num;    
      }

      public int Children ()
         {
             System.out.println("How many Childrens are?");
             int num = DataForm.Childrens.getSelectedIndex(); 
             return num;
         
      }
      public int Infants ()
         {
      
             System.out.println("How many Infants are?");
             int num = DataForm.Infants.getSelectedIndex();
             return num;
      
      }
      
public class Airline 
{
    boolean[] seating = new boolean[11]; /* create 10 seat numbers (array[0] will not be used). Empty seat indicated by false*/
    Scanner input = new Scanner(System.in);

    public void start()
    {       
       // while ( true )
        {
            makeReservation();
        }   
    }

    public void makeReservation()
    {
        System.out.println("PLEASE PRESS: 1-For First Class \n 2-For Business Class\n 3-For Economy Class \n 4-To End: ");
        
        int section = input.nextInt();
        
        switch (section)
        {
            case 1:
                int c=TicketCost+7000;
                System.out.println("TICKET COST(first class)="+c);
                firstClassSeat();
                break;
            case 2:
                 int b=TicketCost+4000;
                System.out.println("TICKET COST(business)="+b);
                BusinessClassSeat();
                break;    
            case 3:
                int a=TicketCost;
                System.out.println("TICKET COST(economy)="+a);
                economySeat();
                break;

            default:
                System.out.println("ended");
                System.exit(0);
                break;
        }
    }

    public void firstClassSeat() // assign a first class seat
    {
        for ( int count = 1; count <= 5; count++ )
        {
            if ( seating[count] == false )  // if false, then a seat is available for assignment
            {
                seating[count] = true;  // assign seat
                System.out.printf("First Class. Seat# %d\n", count);
                break;
            }
            else if ( seating[5] == true ) // If seating[5] is true then first class is fully booked
            {
                if ( seating[10] == true) // If seating[10] is true then economy (and therefore whole flight) is fully booked
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }
                else // ask passenger if they would like an economy ticket instead
                {
                    System.out.println("First Class is fully booked. Would you like Business? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        BusinessClassSeat();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours.");
                        System.exit(0);
                    }
                }
            }
        }
    }   

     public void BusinessClassSeat() // assign a first class seat
    {
        for ( int count = 1; count <= 5; count++ )
        {
            if ( seating[count] == false )  // if false, then a seat is available for assignment
            {
                seating[count] = true;  // assign seat
                System.out.printf("Business Class. Seat#A00 %d\n", count);
                break;
            }
            else if ( seating[5] == true ) // If seating[5] is true then first class is fully booked
            {
                if ( seating[10] == true) // If seating[10] is true then economy (and therefore whole flight) is fully booked
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }
                else // ask passenger if they would like an economy ticket instead
                {
                    System.out.println("Business Class is fully booked. Would you like Economy? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        economySeat();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours.");
                        System.exit(0);
                    }
                }
            }
        }
    }   
    public void economySeat() // assign an economy seat
    {
        for ( int count = 6; count <= 10; count++ )
        {
            if ( seating[count] == false ) // if false, then a seat is available for assignment
            {
                seating[count] = true; // assign seat
                System.out.printf("Economy. Seat# %d\n", count);
                break;
            }
            else if ( seating[10] == true ) // If seating[10] is true then economy is fully booked
            {
                if ( seating[5] == true) // If seating[5] is true then first class (and therefore whole flight) is fully booked
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                    System.exit(0);
                }
                else // ask if passenger would like a first class ticket instead
                {
                    System.out.println("Economy is fully booked. Would you like First Class? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    { 
                        firstClassSeat();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
      
}  