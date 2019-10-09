/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ais_ticket_reservation_system;

import java.util.Scanner;

/**
 *
 * @author Iqra Akhtar
 */
public class AirportDetails
{
    
    String AirportID;
    String City;
    String AirportName;

     public AirportDetails()
     {
        this.AirportID = "BBHU3723";
        this.City = "KARACHI";
        this.AirportName = "JINNAH INTERNATIONAL AIRPORT";
    }
     
    public AirportDetails(String AirportID, String City, String AirportName) 
    {
        this.AirportID = AirportID;
        this.City = City;
        this.AirportName = AirportName;
    }
    
    public AirportDetails(AirportDetails Original)
    {
        this(Original.AirportID,Original.City,Original.AirportName);
    }

    public String getAirportID() {
        return AirportID;
    }

    public void setAirportID(String AirportID) {
        this.AirportID = AirportID;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getAirportName() {
        return AirportName;
    }

    public void setAirportName(String AirportName) {
        this.AirportName = AirportName;
    }

    @Override
    public String toString() {
        return "AIRPORT DETAILS:\n" + "\t\tAirportID=" + AirportID + " \t City=" + City + "\t AirportName=" + AirportName;
    }
    
    Scanner input = new Scanner(System.in);
    public void SpecialDiscount(){
        
     System.out.println("****SAVE UPTO 2000Rs WHREN YOU BOOK YOUR FLIGHT AND HOTEL TOGETHER****");
     System.out.println("Please type 1 if u want to book only flight\nPlease type 2 if u want to book your flight and hotel together");
    int choice = input.nextInt();
    if(choice == 1){
        System.out.println("Thanks for your choice.");
        
    }
    else 
        System.out.println("Thanks for your choice.\nWe are giving you a special discount.Hope you enjoy your journey\nPlease mention the name of the Hotel You want to stay at there.");
        String HOtelName = input.nextLine();
     
    }   
Scanner scan=new Scanner(System.in);

public void MakingNewSchedule(FlightSchedule ss)
{
    System.out.println("for creating new flight schedules:");
    System.out.println("ENTER DATE:");
    String date=scan.next();
    System.out.println("ENTER DEPARTURE:");
    String departure=scan.next();
    System.out.println("ENTER DESTINATION:");
    String destination=scan.next();
    
    ss.NormalShedule(departure, destination,date);
    
}
}
