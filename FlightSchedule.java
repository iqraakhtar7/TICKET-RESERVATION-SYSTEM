/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ais_ticket_reservation_system;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Iqra Akhtar
 */
public class FlightSchedule 
{
  
    int FlightNo;
    int AirbusNo;
    String RouteDescription;
    String DepartDate;
    String DepartTime;
    int JourneyHour;

    public FlightSchedule() 
    {
        this.FlightNo = 0012;
        this.AirbusNo = 014;
        this.RouteDescription ="STAY AT:\n"
                + "Lahore\n"
                + "Faislabad" ;
        this.DepartDate = "12/09/2016";
        this.DepartTime = "02:30PM";
        this.JourneyHour = 07;
    }
    public FlightSchedule(int FlightNo, int AirbusNo, String RouteDescription, String DepartDate, String DepartTime, int JourneyHour) 
    {
        this.FlightNo = FlightNo;
        this.AirbusNo = AirbusNo;
        this.RouteDescription = RouteDescription;
        this.DepartDate = DepartDate;
        this.DepartTime = DepartTime;
        this.JourneyHour = JourneyHour;
    }
      public FlightSchedule(FlightSchedule Original)
      {
      this(Original.FlightNo,Original.AirbusNo,Original.RouteDescription,Original.DepartDate,Original.DepartTime,Original.JourneyHour);        
      }

    public int getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(int FlightNo) {
        this.FlightNo = FlightNo;
    }

    public int getAirbusNo() {
        return AirbusNo;
    }

    public void setAirbusNo(int AirbusNo) {
        this.AirbusNo = AirbusNo;
    }

    public String getRouteDescription() {
        return RouteDescription;
    }

    public void setRouteDescription(String RouteDescription) {
        this.RouteDescription = RouteDescription;
    }

    public String getDepartDate() {
        return DepartDate;
    }

    public void setDepartDate(String DepartDate) {
        this.DepartDate = DepartDate;
    }

    public String getDepartTime() {
        return DepartTime;
    }

    public void setDepartTime(String DepartTime) {
        this.DepartTime = DepartTime;
    }

    public int getJourneyHour() {
        return JourneyHour;
    }

    public void setJourneyHour(int JourneyHour) {
        this.JourneyHour = JourneyHour;
    }
      
     public String NormalShedule(String departure,String Destination,String date)
     {
         String schedule="";
         schedule+=("                                   "+departure+"  ~~~→   "+Destination);
         schedule+="\n--------------------------------------------------------------------------------\n";
         schedule+="\n                                    DATE                                    TIMES                                    FLIGHT.INFO                                    FLIGHT.NO                                    \n                                    ";
         schedule+=(date+"                                11:00AM                                   "+departure+"                                          "+this.FlightNo+"                                    \n                                    ");
         schedule+=("                                             04:00PM                                 "+Destination+"                                          \n");

       JOptionPane.showMessageDialog(null, schedule);
       return schedule;
     }
         
  }