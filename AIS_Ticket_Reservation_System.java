
//package ais_ticket_reservation_system;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.Scanner;
//
//
//public class AIS_Ticket_Reservation_System{
//    
//public static void main(String[] args) {
//        // TODO code application logic here
//        
//        CustomerList cc=new CustomerList();
//        //SINGLETON PATTERN
//    //CustomerList cc = CustomerList.getInstance();
//
//    
//                // FILING//
////    java.io.File file=new java.io.File("information.txt");
////     try{
////           Scanner input=new Scanner(file);
////           while(input.hasNext())
////           {
////               String num=input.nextLine();
////             System.out.println(num);
////            String[] split=num.split(" ");
////          
////    cc.addCustomer(split[0],split[1] , Integer.parseInt(split[2]), split[3], Integer.parseInt(split[4]), 
////            split[5], split[6],Long.parseLong(split[7]),Integer.parseInt(split[8]) , split[9], split[10]);  
////               
////           }}
////           catch (FileNotFoundException e)
////                   {
////                   System.err.format("File does not exist ");
////                   }
////       
////    System.out.println(cc.toString());
////    
//                              //OVERLOADING BETWEEN ADD FUNTION//
//
//// CustomerList list=new CustomerList();          
//// list.adddCustomer("ALI", "RAZA");
//// list.adddCustomer("UMER", "SHAKEE", 19, "JANUARY", 1997, "BTHH2765508", "umer.shakkel@gmail.com", 03005673207,19,"KARACHI", "LAHORE");
//// System.out.println(list.toString());
//
//          
//                  //OVERRIDING BETWEEN ADD FUNTION//
//
////FlightSchedule ff=new FlightSchedule();
////TicketDetails tt=new TicketDetails();
////ff.NormalShedule("karachi", "islambad", "12/01/17");
////tt.NormalShedule("islamabd","lahore", "14/01/17");
//
//                          //POLYMORPHIC ARRAY//
//                          
////TravelClass q=new TravelClass();
////Customer bb=new Customer();
//// 
////Facilities arrayoffacilities[]=new Facilities[2];
////
//// arrayoffacilities[0]=q;
//// arrayoffacilities[1]=bb;
//// String out="these are there differeent classes of facilities";
//      
//
//////                    OBJECT PASSING THROUGH FUNCTION
//// 
////
////Customer ee=new Customer("UMER", "SHAKEE", 19, "JANUARY", 1997, "BTHH2765508", "umer.shakkel@gmail.com", 03005673207,19,"KARACHI", "LAHORE");
////cc.adddCustomer(ee);
////System.out.println(cc.toString());
//
//
////
//////                       DEEP COPY
////
////Customer masroorian=new Customer("UMER", "SHAKEE", 19, "JANUARY", 1997, "BTHH2765508", "umer.shakkel@gmail.com", 03005673207,19,"KARACHI", "LAHORE");
////Customer bahrian=new Customer(masroorian);
////masroorian.setFirstName("HAMZA");
////System.out.println(masroorian.toString()); 
////System.out.println(bahrian.toString());
//                       //SHALLOW COPY
//
////Customer fazain=new Customer("UMER", "SHAKEE", 19, "JANUARY", 1997, "BTHH2765508", "umer.shakkel@gmail.com", 03005673207,19,"KARACHI", "LAHORE");
////Customer nedian;
////nedian=fazain;
////fazain.setFirstName("ALI");
////fazain.setLastName("khan");
////System.out.println(nedian.toString());
//
//
//                  //CONSTRUCTOR CALLING
////
////Customer customer1=new Customer();
////Customer customer2=new Customer("UMER", "SHAKEE", 19, "JANUARY", 1997, "BTHH2765508", "umer.shakkel@gmail.com", 03005673207,19,"KARACHI", "LAHORE");
////Customer customer3=new Customer(customer2);
////System.out.println(customer1.toString());
////System.out.println(customer2.toString());
////System.out.println(customer3.toString());
//
//               //ASSOCIATION
////FlightSchedule bb=new FlightSchedule();
////AirportDetails zz =new AirportDetails();
////
////zz.MakingNewSchedule(bb);
//
////Customer customer2=new Customer("UMER", "SHAKEE", 19, "JANUARY", 1997, "BTHH2765508", "umer.shakkel@gmail.com", 03005673207,19,"KARACHI", "LAHORE");
////Customer customer3=new Customer(customer2);
////System.out.println(customer1.toString());
////System.out.println(customer2.toString());
////System.out.println(customer3.toString());
//
//              //ARRAY LIST
//              
// //ArrayList CCList = new ArrayList(10);\
//
//Scanner scan=new Scanner(System.in);
//       AirportDetails aa=new AirportDetails();
//       System.out.println(aa.toString());
//       TravelClass tt=new TravelClass();
//       Customer a=new Customer();
//       System.out.println("\nFROM: ");
//       String departureask=scan.next();
//       System.out.println("\nTO: ");
//       String destinationask=scan.next();
//       System.out.println("\nDATE: ");
//       String dateask=scan.next();
//       FlightSchedule v=new FlightSchedule();
//       v.NormalShedule(departureask, destinationask, dateask);
//       v.setDepartDate(dateask);
//       System.out.println("\n Select the class from which you want to travel:\n\n"
//                    
//                    + "1- Economy Class\n"
//                    + "2- Bussiness Class\n"
//                    + "3- First Class\"\n" );
//            Scanner no=new Scanner(System.in);
//            int z=no.nextInt();
//              try {
//                 if(z<1 || z>3) 
//                 {
//                     System.out.println("Wrong Entry! Try Again");
//                 }
//             }
//             catch(UnsupportedOperationException r)
//             {
//               System.out.println("Number is not between 1-3");  
//            
//             }
//             System.out.println("how many passengers are you:");
//             int d=no.nextInt();
//            tt.TicketCostOfTravelClasses(z);
//                System.out.println("\nENTER PASSENGER INFO USING SPACE BETWEEN DATA :\n\n"
//                 + "NAME  SIRNAME  DATE OF BIRTH  MONTH  YEAR PASSPORT.NO  E-MAIL CONTACT.NO  AGE  DEPARTURE  DESTINATION\n"); 
//                String line=no.nextLine();
//            for(int j=0;j<d;j++)
//            {
//             line=no.nextLine();
//            String[] split=line.split(" ");
//           
//            cc.addCustomer(split[0],split[1] , Integer.parseInt(split[2]), split[3], Integer.parseInt(split[4]), split[5], split[6],Long.parseLong(split[7]),Integer.parseInt(split[8]) , departureask, destinationask);
//cc.ADDTOFILE(split[0],split[1] , Integer.parseInt(split[2]), split[3], Integer.parseInt(split[4]), split[5], split[6],Long.parseLong(split[7]),Integer.parseInt(split[8]) , departureask, destinationask);
//
//		//           System.out.println("ENTER CUSTOMER INFORMATION IN DIALOUG BOX: ");
////        String FIRSTNAME=JOptionPane.showInputDialog("FIRST NAME");
////        
////        String LASTNAME=JOptionPane.showInputDialog("LAST NAME");
////        String c=JOptionPane.showInputDialog("DATE OF BIRTH"); 
////        String MONTHOFBIRTH=JOptionPane.showInputDialog("BIRTHDAY MONTH");
////        String e=JOptionPane.showInputDialog("BIRTHDAY YEAR");
////        String PASSPORTNO=JOptionPane.showInputDialog("PASSPORT.NO");
////        String EMAIL=JOptionPane.showInputDialog("E-MAIL");
////        String h=JOptionPane.showInputDialog("CONTACT.NO");
////        String j=JOptionPane.showInputDialog("AGE");
////        String DEPARTURE=JOptionPane.showInputDialog("DEPARTURE");
////        String DESTINATION=JOptionPane.showInputDialog("DESTINATION");
////             int DATEOFBIRTH=Integer.parseInt(c);
////             int YEAROFBIRTH=Integer.parseInt(e);
////             long CONTACTNO=Long.parseLong(h);
////             int AGE=Integer.parseInt(j);
////             cc.addCustomer(FIRSTNAME,LASTNAME,DATEOFBIRTH ,MONTHOFBIRTH, YEAROFBIRTH, PASSPORTNO,EMAIL, CONTACTNO,AGE , DEPARTURE,DESTINATION);
////        
// //CCList.add(new Customer(FIRSTNAME,LASTNAME,DATEOFBIRTH ,MONTHOFBIRTH, YEAROFBIRTH, PASSPORTNO,EMAIL, CONTACTNO,AGE , DEPARTURE,DESTINATION));
//      //  System.out.println(CCList.toString());
////                            
////           System.out.println("YOU ENTERED DATA SUCCESSFULLY : "); 
////           System.out.println(cc.toString());
//            
//    }
//    // System.out.println(cc.Recipet());        
//             //CONSOLE BASE OUTPUT
//             
//System.out.println("\n\nYOU ENTERED DATA SUCCESSFULLY : "); 
//          System.out.println(cc.toString());
////          TicketDetails xx=new TicketDetails();
////          xx.Details();
////             
////           //CANCEL RESERVATION
//           System.out.println("ENTER THE FIRST AND LAST NAME OF CUSTOMER IF U WANT TO CANCEL RESERVATION USING;SPACE BETWEEN THEM: ");
//         line=no.nextLine();
//            String[] split=line.split(" ");
//           cc.CancelReservation(split[0], split[1]);
//           cc.DeleteFromFile(split[0],split[1]);
////                   CANCEL RESERVATION
////           System.out.println("ENTER THE DEPARTURE AND DESTINATION OF CUSTOMER IF U WANT TO CANCEL RESERVATION USING;SPACE BETWEEN THEM: ");
////        line=no.nextLine();
//  //          String[] split=line.split(" ");
//    //       cc.cancelReservation(split[0], split[1]);
//  //  cc.DeleteFromFile(split[0],split[1]);
////           
////                   CANCEL RESERVATION
////           System.out.println("ENTER THE PASSPORT.NO OF CUSTOMER IF U WANT TO CANCEL RESERVATION : ");
////          line=scan.nextLine();
////            String[] split=line.split(" ");
////           cc.CancelReservation(split[0]); 
////cc.DeleteFromFileWithPassport(split[0]);
//
//       try
//           {
//             BufferedReader f5=new  BufferedReader(new FileReader("C:\\Users\\Hina\\Documents\\NetBeansProjects\\TicketReservingSystem\\information.txt"));  
//             System.out.println("done");                          
//           } 
//       catch(Exception e)
//       {
//           
//       }
//      
//        System.out.println("PASSENGER LIST AFTER CANCELLATION OF RESERVATION: ");
//        System.out.println(cc.toString());
//    //    cc.Recipet();
//             
//
//       }
//    
//}
////    
////
////
