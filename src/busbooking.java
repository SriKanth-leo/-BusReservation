import java.sql.Time;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class busbooking {
    int bus_no;
    String passenger_name;

    Date date;
  busbooking(){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the bus_no :");
      bus_no= sc.nextInt();
      System.out.println("Enter the passenger_name :");
      passenger_name=sc.next();
      System.out.println("Enter the Date dd-mm-yyyy :");
      String dateinput=sc.next();
      SimpleDateFormat ob=new SimpleDateFormat("dd-MM-yyyy");
      try {
          date=ob.parse(dateinput);
      } catch (ParseException e) {
          throw new RuntimeException(e);
      }
  }
    public  boolean isAvailable(ArrayList<businfo>buses,ArrayList<busbooking>booking){
          int capacity=10;
          for (businfo bus:buses){
              if (bus.getBus()==bus_no){
                  capacity =bus.getCapacity();
              }


          }
          int booked=0;
          for (busbooking b:booking){
              if (b.bus_no==bus_no && b.date.equals(date)){
                       booked++;
              }
          }
                return booked<capacity ? true : false;
    }

}
