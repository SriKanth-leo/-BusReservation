import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
      ArrayList<businfo>buses=new ArrayList<businfo>();
      ArrayList<busbooking>booking=new ArrayList<busbooking>();
      buses.add(new businfo(01,1,"TN 15 AB2004","Sundaram","Siva",
              "Kallakurichi to Salem","8.00Am","11.30Am"));
        buses.add(new businfo(02,2,"TN 15 AB2004","inba","hari",
                "Kallakurichi to Salem","12.00pm","3.00pm"));
        for (businfo b:buses){
            b.displaybusinfo();
        }
        int useropt=1;
        Scanner obj =new Scanner(System.in);
        while (useropt==1){
            System.out.println("Enter 1 to book and 2 to exit:");
           useropt= obj.nextInt();
           if (useropt==1){
              busbooking bookings=new busbooking();
              if (bookings.isAvailable(buses,booking)){
                  booking.add(bookings);
                  System.out.println("Your booking is conform");
              }
              else {
                  System.out.println("sry,the bus is full try another date ");
              }
           }
           else {
               System.out.println("You press 2 so Exit the booking");
           }
        }
    }

}