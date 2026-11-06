interface ParkingCharge {
   double calculateCharge();
   void displayParkingDetails();
   }
   
class vehicleParking{
    String vehicleNumber;
    String vehicleType;
    double parkingHours;
   
    public vehicleParking(String vehicleNumber, String vehicleType, double parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

class TwoWheeler extends vehicleParking implements ParkingCharge{
   public TwoWheeler(String vehicleNumber, double parkingHours) {
        super(vehicleNumber, "Two Wheeler", parkingHours);
      }
      public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 20;
        } else {
            return (2*20)+((parkingHours-2)*10);
        }
    }
    public void displayParkingDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Parking Hours: " + parkingHours + " hrs");
        System.out.println("Total Charge: Rs. " + calculateCharge());
    }
}

class FourWheeler extends vehicleParking implements ParkingCharge{
   public FourWheeler(String vehicleNumber, double parkingHours) {
        super(vehicleNumber, "Four Wheeler", parkingHours);
      }
     
      public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 50;
        } else {
            return (2*50)+((parkingHours-2)*30);
        }
    }
    public void displayParkingDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Parking Hours: " + parkingHours + " hrs");
        System.out.println("Total Charge: Rs. " + calculateCharge());
    }
}

class Main {
   public static void main(String args[])
   {
      ParkingCharge p;
      p=new TwoWheeler("KA 05 HX 3233",3.5);
      p.displayParkingDetails();
      p=new FourWheeler("KA 05 ND 6514",6);
      p.displayParkingDetails();
     
      System.out.println("\n\nName : Brunda S   Usn : 1WN25CS053");
      }
 }
