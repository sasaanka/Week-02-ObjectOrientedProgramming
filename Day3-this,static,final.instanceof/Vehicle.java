

class Vehicle{
    static int registrationFee=500;
    final int registrationNumber;
    String ownerName;
    String vehicleType;
    Vehicle(int registrationNumber,String ownerName,String vehicleType){
        this.registrationNumber=registrationNumber;
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    public static void updateRegistartionfee(int newregistartionfee){
        registrationFee=newregistartionfee;
        System.out.println("The updated fee is "+registrationFee);
    }
    void displaydetails(){
        System.out.println("Registration Number: "+registrationNumber);
        System.out.println("Registartionfee: "+registrationFee);
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Type of vehicle: "+vehicleType);
    }
    public static void main(String[] args) {
        Vehicle v1=new Vehicle(7879,"sasanka","Thar");
        Vehicle v2=new Vehicle(4539,"Bharath","Benz");
        System.out.println("-----vehicle 1-------");
        v1.displaydetails();
        Vehicle.updateRegistartionfee(300);
        System.out.println("-----vehicle 2-------");
        v2.displaydetails();
    }
}