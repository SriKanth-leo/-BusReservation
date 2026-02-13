public class businfo {
    private int bus;
    private int capacity;
   private String busno;
    private String driverName;
    private   String conductorName;
    private String busroute;
   private String bustime;
    private String busreachtime;

  businfo( int bus,
    int capacity,
    String busno,
    String driverName,
    String conductorName,
    String busroute,
    String bustime,
    String busreachtime){
      this.bus=bus;
      this.capacity=capacity;
      this.busno=busno;
      this.driverName=driverName;
      this.conductorName=conductorName;
      this.busroute=busroute;
      this.bustime=bustime;
      this.busreachtime=busreachtime;

  }

    public int getBus() {
        return bus;
    }
    public int getCapacity(){
      return capacity;
    }

    public String getBusno() {
        return busno;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getConductorName() {
        return conductorName;
    }

    public String getBusroute() {
        return busroute;
    }

    public String getBusreachtime() {
        return busreachtime;
    }

    public String getBustime() {
        return bustime;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }
    public void setCapacity(int capacity){
      this.capacity=capacity;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setConductorName(String conductorName) {
        this.conductorName = conductorName;
    }

    public void setBusroute(String busroute) {
        this.busroute = busroute;
    }

    public void setBustime(String bustime) {
        this.bustime = bustime;
    }

    public void setBusreachtime(String busreachtime) {
        this.busreachtime = busreachtime;
    }
    public void displaybusinfo(){
        System.out.println("bus:" + bus + " busno:" + busno + " DriverName:" + driverName + " ConductorName:" + conductorName + " Busroute:" + busroute + " Bustime:" + bustime + " busreachtime:" + busreachtime);
    }
}
