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
public class TicketDetails extends FlightSchedule
{
 
   protected String AirlineName;
   protected long TicketNo;
   protected String RightDate;
   String RightTime;

   public TicketDetails()
   {
        this.AirlineName = "AIS AIRLINE";
        this.TicketNo = 100088;
        this.RightDate = "07/01/2017";
        this.RightTime = "05:00PM";
    }
   
    public TicketDetails(String AirlineName,long TicketNo, String RightDate, String RightTime) 
    {
        this.AirlineName = AirlineName;
        this.TicketNo = TicketNo;
        this.RightDate = RightDate;
        this.RightTime = RightTime;
    }
    
     public TicketDetails(TicketDetails Original) 
    {
        this(Original.AirlineName,Original.TicketNo,Original.RightDate,Original.RightTime);
    }

    public String getAirlineName() {
        return AirlineName;
    }

    public void setAirlineName(String AirlineName) {
        this.AirlineName = AirlineName;
    }

    public long getTicketNo() {
        return TicketNo;
    }

    public void setTicketNo(long TicketNo) {
        this.TicketNo = TicketNo;
    }

    public String getRightDate() {
        return RightDate;
    }

    public void setRightDate(String RightDate) {
        this.RightDate = RightDate;
    }

    public String getRightTime() {
        return RightTime;
    }

    public void setRightTime(String RightTime) {
        this.RightTime = RightTime;
    }

    @Override
    public String toString() {
        return "TicketDetails:\n  AirlineName=" + AirlineName + "\n TicketNo=" + TicketNo + "\n RightDate=" + RightDate + "\n RightTime=" + RightTime + '}';
    }   
    
}
