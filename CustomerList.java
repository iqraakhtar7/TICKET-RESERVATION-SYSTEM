/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ais_ticket_reservation_system;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author Iqra Akhtar
 */
public class CustomerList {
    
    Customer CList[];          //EXAMPLE OF COMPOSITE PATTERN
      int TotalReservations;
      //private Customer CList[];
    //private int TotalReservations
   // private static CustomerList  instance = new CustomerList();  //Singleton Pattern
    /* public static CustomerList getInstance()
    {
        return instance;
    } */
    
     public CustomerList()
    {
        CList = new Customer[10];
        this.TotalReservations = 0;
    }
     
     public CustomerList(CustomerList cc) {
         CList = cc.CList;
     }

    public Customer[] getCList() {
        return CList.clone();
    }
    
    public void setCList(Customer[] CList) {
        this.CList = CList;
    }

    public int getTotalReservations() {
        return TotalReservations;
    }

   public void setTotalReservations(int TotalReservations) {
      this.TotalReservations = TotalReservations;
    }
    
   
   
    public void addCustomer(String firstName, String lastName, int dateOfBirth, String monthOfBirth, int yearOfBirth,
            String passPortNo, String email,long contactNo, int age, String Departure, String Destination) 
    {
    if (this.TotalReservations == CList.length)
    {
      increaseSize();
    }
    CList[this.TotalReservations]=new Customer(firstName,lastName,dateOfBirth,monthOfBirth,
                   yearOfBirth,passPortNo,email,contactNo,
                   age,Departure,Destination);
    
    this.TotalReservations++;
}
     public void adddCustomer(String firstName, String lastName, int dateOfBirth, String monthOfBirth, int yearOfBirth,
             String passPortNo, String email,long contactNo, int age, String Departure, String Destination)
    
 {      
    if (this.TotalReservations == CList.length)
    {
        increaseSize();
    }
    CList[this.TotalReservations]=new Customer
        (firstName,lastName,dateOfBirth ,monthOfBirth,
      yearOfBirth,passPortNo,email,contactNo,age,Departure,Destination);
    
    this.TotalReservations++;
 }
     
      public void adddCustomer(String firstName, String lastName)  //OVERLOADING BETWEEN ADD FUNTIONS//
 {
    if (this.TotalReservations == CList.length)
    {
        increaseSize();
    }
  CList[this.TotalReservations]=new Customer(firstName,lastName);
    
    this.TotalReservations++;
 }
   public void adddCustomer(Customer newcustomer)   //PASSING OBJECT THROUGH FUNCTION
 {
    if (this.TotalReservations == CList.length)
    {
        increaseSize();
    }
    CList[this.TotalReservations]=new Customer(newcustomer);
    
    this.TotalReservations++;
 }
 private void increaseSize()
{
    Customer[] tempReference = new Customer[this.CList.length * 2];
    for(int c=0; c<this.CList.length; c++)
    {
        tempReference[c] = CList[c];
    this.CList = tempReference;
    } 
}

public boolean CancelReservation(String firstName, String lastName)

  {
      
    int loc = findCustomer (firstName, lastName);
        
    if(loc==-1)
    {
     System.out.println("Customer not found");
     return false;
    } 
   
   for(int i=loc+1;i<this.TotalReservations;i++)
    {
        this.CList[i-1].setFirstName(this.CList[i].getFirstName());
        this.CList[i-1].setLastName(this.CList[i].getLastName());
        this.CList[i-1].setDateOfBirth(this.CList[i].getDateOfBirth());
        this.CList[i-1].setMonthOfBirth(this.CList[i].getMonthOfBirth());
        this.CList[i-1].setYearOfBirth(this.CList[i].getYearOfBirth());
        this.CList[i-1].setPassPortNo(this.CList[i].getPassPortNo());
        this.CList[i-1].setEmail(this.CList[i].getEmail());
        this.CList[i-1].setContactNo(this.CList[i].getContactNo());
        this.CList[i-1].setAge(this.CList[i].getAge());
        this.CList[i-1].setDeparture(this.CList[i].getDeparture());
        this.CList[i-1].setDestination(this.CList[i].getDestination());
    } 
 

  this.TotalReservations--;
    return true;
  
  }
public boolean cancelReservation(String Departure, String Destination)

  {
      
    int loc = findCustomer (Departure, Destination);
        
    if(loc==-1)
    {
     System.out.println("Customer not found");
     return false;
    } 
   
   for(int i=loc+1;i<this.TotalReservations;i++)
    {
    this.CList[i-1].setFirstName(this.CList[i].getFirstName());
    this.CList[i-1].setLastName(this.CList[i].getLastName());
    this.CList[i-1].setDateOfBirth(this.CList[i].getDateOfBirth());
    this.CList[i-1].setMonthOfBirth(this.CList[i].getMonthOfBirth());
    this.CList[i-1].setYearOfBirth(this.CList[i].getYearOfBirth());
    this.CList[i-1].setPassPortNo(this.CList[i].getPassPortNo());
    this.CList[i-1].setEmail(this.CList[i].getEmail());
    this.CList[i-1].setContactNo(this.CList[i].getContactNo());
    this.CList[i-1].setAge(this.CList[i].getAge());
    this.CList[i-1].setDeparture(this.CList[i].getDeparture());
    this.CList[i-1].setDestination(this.CList[i].getDestination());
    } 
 

  this.TotalReservations--;
    return true;
  
  }
public boolean CancelReservation(String PassportNo)

  {
      
    int loc = findCustomer (PassportNo);
        
    if(loc==-1)
    {
     System.out.println("Customer not found");
     return false;
    } 
   
   for(int i=loc+1;i<this.TotalReservations;i++)
    {
        this.CList[i-1].setFirstName(this.CList[i].getFirstName());
        this.CList[i-1].setLastName(this.CList[i].getLastName());
        this.CList[i-1].setDateOfBirth(this.CList[i].getDateOfBirth());
        this.CList[i-1].setMonthOfBirth(this.CList[i].getMonthOfBirth());
        this.CList[i-1].setYearOfBirth(this.CList[i].getYearOfBirth());
        this.CList[i-1].setPassPortNo(this.CList[i].getPassPortNo());
        this.CList[i-1].setEmail(this.CList[i].getEmail());
        this.CList[i-1].setContactNo(this.CList[i].getContactNo());
        this.CList[i-1].setAge(this.CList[i].getAge());
        this.CList[i-1].setDeparture(this.CList[i].getDeparture());
        this.CList[i-1].setDestination(this.CList[i].getDestination());
    } 
 

  this.TotalReservations--;
    return true;
  
  }
private int findCustomer(String firstName, String lastName)
 {
  
  for(int i=0;i<TotalReservations;i++)
  {
      if((CList[i].getFirstName().equals(firstName))&&(CList[i].getLastName().equals(lastName)))
      {    
      return i;
      }
  } 
       return -1;
 }

private int findCustomer(String PassportNo)
 {
  
  for(int i=0;i<TotalReservations;i++)
  {
      if(CList[i].getPassPortNo().equals(PassportNo))
      {    
      return i;
      }
  } 
       return -1;
 }

private int FindCustomer(String Departure, String Destination)
 {
  
  for(int i=0;i<TotalReservations;i++)
  {
      if((CList[i].getDeparture().equals(Departure))&&(CList[i].getDestination().equals(Destination)))
      {    
      return i;
      }
  } 
       return -1;
 }
     @Override
     public String toString()
    { 
        String result = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
        result += "*TOTAL NUMBER OF CUSTOMERS*:" + TotalReservations + "\n";
        result += "\n\n ###CUSTOMER LIST WITH CUSTOMER INFORMATION###\n\n";
        for(int c=0; c< TotalReservations; c++)
        {
            result+="CUTOMER.NO:"+(c+1);
            result += CList[c].toString() + "\n";
        
        }return result;
    }
    
      public String Recipet()
    {
        String result = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
        result += "*TOTAL NUMBER OF CUSTOMERS*:" + TotalReservations + "\n";
        result += "\n\n ###CUSTOMER TICKETS ###\n";
        
        for(int c=0; c< TotalReservations; c++)
        {             
            result+= CList[c].Ticket();
        }
        return result;
    }
        public void ADDTOFILE(String firstName, String lastName, int dateOfBirth, String monthOfBirth, int yearOfBirth,
             String passPortNo, String email,long contactNo, int age, String Departure, String Destination)
      {
          try{
            Writer bw = null;
            
             File file=new File("C:\\Users\\Hina\\Desktop\\AIS_Ticket_Reservation_System\\AIS_Ticket_Reservation_System\\write.txt");
             bw = new PrintWriter(new FileWriter(file,true));
	

			String content = (firstName)+" "+(lastName)+" "+(dateOfBirth)+
                                " "+(monthOfBirth)+
                                " "+yearOfBirth+
                                " "+passPortNo+
                                " "+email+
                                " "+contactNo+
                                " "+age+
                                " "+Departure+
                                " "+Destination+" ";

			bw.write(content);
                       bw.append("\n");
			System.out.println("Done");

    if (bw != null)
        bw.close();
    
          }
          catch(FileNotFoundException ee){
JOptionPane.showMessageDialog(null,"file not found");
      }
          catch (IOException e) {

			System.out.println("INCORRECT INPUT");

		} 
      }
 public void DeleteFromFile (String firstName,String lastname)
      {
          try{
                BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Hina\\Desktop\\AIS_Ticket_Reservation_System\\AIS_Ticket_Reservation_System\\.txt"));
                String line;
                String input = "";
               int  CheckForTrueValue=0;
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if ((line.contains(firstName))
                            &&
                                    (line.contains(lastname)))
                    {
                        line ="";
//                        System.out.println("Line deleted.");
                      JOptionPane.showMessageDialog(null," Customer Deleted "+"\n");
                      CheckForTrueValue++;
                      
                    }
                    input += line + '\n';
                }
                if(CheckForTrueValue==0)
                                          JOptionPane.showMessageDialog(null," Passenger Does Not Exsist"+"\n");

                    
                FileOutputStream File = new FileOutputStream("C:\\Users\\Hina\\Desktop\\AIS_Ticket_Reservation_System\\AIS_Ticket_Reservation_System\\write.txt");
                File.write(input.getBytes());
                
                file.close();
                File.close();
        }
           catch (FileNotFoundException e)
                   {
                JOptionPane.showMessageDialog(null,"file not found");
                   }
        catch(IOException e)
        {
        
			System.out.println("INCORRECT INPUT ! ");

		} 
          
      }
 public void DeleteFromFileWithPassport(String passport)
      {
          try{
                BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Hina\\Desktop\\AIS_Ticket_Reservation_System\\AIS_Ticket_Reservation_System\\write.txt"));
                String line;
                String input = "";
               int  CheckForTrueValue=0;
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(passport))
                            
                    {
                        line ="";
//                        System.out.println("Line deleted.");
                      JOptionPane.showMessageDialog(null," customer deleted "+"\n");
                      CheckForTrueValue++;
                    }
                    input += line + '\n';
                }
                if(CheckForTrueValue==0)
                                          JOptionPane.showMessageDialog(null,"Passenger NotFound"+"\n");

                    
                FileOutputStream File = new FileOutputStream("C:\\Users\\Hina\\Desktop\\AIS_Ticket_Reservation_System\\AIS_Ticket_Reservation_System\\write.txt");
                File.write(input.getBytes());
                file.close();
                File.close();
        }
           catch (FileNotFoundException e)
                   {
                JOptionPane.showMessageDialog(null,"file not found");
                   }
        catch(IOException e)
        {
        JOptionPane.showMessageDialog(null,"INCORRECT INPUT!");}
      }
}
