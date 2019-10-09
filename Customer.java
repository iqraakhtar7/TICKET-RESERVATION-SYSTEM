/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ais_ticket_reservation_system;

import javax.swing.JOptionPane;

/**
 *
 * @author Iqra Akhtar
 */
public class Customer extends TravelClass{
 
    
    protected String firstName;
   protected String lastName;
    private int dateOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;
    protected String passPortNo;
    private String email;
    private long contactNo;
    private int age;
    protected String Departure;
    protected String Destination;
    
    
    
    public Customer()
    {
    this.firstName = "Ali";
    this.lastName = "Ahmed";
    this.dateOfBirth = 16;
    this.monthOfBirth = "March";
    this.yearOfBirth = 1887;
    this.passPortNo = "BB123456789";
    this.email = "ali.ahmed56@yahoo.com";
    this.contactNo = 03005673207;
    this.age = 45;
    this.Departure = "Karachi";
    this.Destination = "Islamabad";
    }

    public Customer(String firstName, String lastName, int dateOfBirth, String monthOfBirth, int yearOfBirth, 
            String passPortNo, String email, long contactNo, int age, String Departure, String Destination)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.passPortNo = passPortNo;
        this.email = email;
        this.contactNo = contactNo;
        this.age = age;
        this.Departure = Departure;
        this.Destination = Destination;
    }

   public Customer(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
    }
    
        
    public  Customer(Customer OriginalCustomer)
    {
      this
        (OriginalCustomer.firstName,OriginalCustomer.lastName,OriginalCustomer.dateOfBirth,
             OriginalCustomer.monthOfBirth,OriginalCustomer.yearOfBirth,OriginalCustomer.passPortNo,
             OriginalCustomer.email,OriginalCustomer.contactNo,OriginalCustomer.age,
             OriginalCustomer.Departure,OriginalCustomer.Destination);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getDateOfBirth() 
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMonthOfBirth()
    {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPassPortNo()
    {
        return passPortNo;
    }

    public void setPassPortNo(String passPortNo)
    {
        this.passPortNo = passPortNo;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public long getContactNo()
    {
        return contactNo;
    }

    public void setContactNo(long contactNo) 
    {
        this.contactNo = contactNo;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getDeparture() 
    {
        return Departure;
    }

    public void setDeparture(String Departure)
    {
        this.Departure = Departure;
    }

    public String getDestination() 
    {
        return Destination;
    }

    public void setDestination(String Destination)
    {
        this.Destination = Destination;
    }
    
//    public String TicketPrintting()
//    {
//        Recipet c=new Recipet();
//     return c.Ticket(); 
//    }
int i=0;
    @Override
    public String toString()
    {
        
        return "\n\t  FIRST NAME=" + firstName + "\t LASTNAME=" + lastName;
       
        
    }
    
      public String Ticket()
      { 
        String ObjectInfo = "                                                      ****AIS AIRLINES****\n\n\n";
         ObjectInfo+= "Dated: 23/12/2016\nTicket Status :RESERVED\n\n";
        
        ObjectInfo+= "PASSANGER NAME:                                     PASSPORT.NO                \n     "
                +this.firstName+" "+this.lastName+"                                                "+this.passPortNo;
           ObjectInfo+="\n--------------------------------------------------------------------------------";
           ObjectInfo+="\nFROM:\n       "+this.Departure;
           ObjectInfo+="\n-----------------------------------------    FLIGHT:"+super.FlightNo+"                DATE:"+super.DepartDate+"               SEAT.NO: A000                ";
           ObjectInfo+="\nTO:\n      "+this.Destination;
           ObjectInfo+="\n--------------------------------------------------------------------------------";
           ObjectInfo+="\n         GATE :                        GROUP :                        DEPARTS :                        BOARDING TIME :";
           ObjectInfo+="\n             6 :                                   2 :                                   "+super.DepartTime+"                                      "+super.RightTime           ;
           ObjectInfo+= " \n\n              %%BOARDING PASS%%\n\n";     
    
           JOptionPane.showMessageDialog(null, ObjectInfo);
                 return ObjectInfo;   
      }
                         
    }
     
    
