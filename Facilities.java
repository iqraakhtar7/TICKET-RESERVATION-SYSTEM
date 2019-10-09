/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ais_ticket_reservation_system;

/**
 *
 * @author Iqra Akhtar
 */
   public interface Facilities 
   {
        public abstract void TicketCostOfTravelClasses(int select);
        public abstract void DetailsOfClasses(String trvlclass);
        public abstract void Seatsize(int width,int pitch);
            
    }
