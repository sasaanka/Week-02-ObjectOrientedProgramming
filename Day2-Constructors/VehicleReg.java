class VehicleReg{
    String ownerName;
    String vehicleType;
    static int registrationfee=5000;
    VehicleReg(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    void displaydetails(){
        System.out.println("Owner name: "+ownerName);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Registration fee: "+registrationfee);
    }
    static void updateRegfee(int newfee){
        registrationfee=newfee;
    }
    public static void main(String[] args) {
        VehicleReg v1=new VehicleReg("Sasanka","Scooty");
        VehicleReg v2=new VehicleReg("Abhinaya","car");
        System.out.println("Before Updating Registration Fee:");
        v1.displaydetails();
        v2.displaydetails();
        VehicleReg.updateRegfee(300);
        System.out.println("\nAfter Updating Registration Fee:");
        System.out.println("Details of person 1-----");
        v1.displaydetails();
        System.out.println("Details of person 2-----");
        v2.displaydetails();
    }
}