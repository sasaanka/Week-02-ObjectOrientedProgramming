abstract class Vehicle{
    int vehicleNumber;
    String type;
    int rentalRate;
    public Vehicle(int vehicleNumber,String type,int rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }
    public int getVehiclenum(){
        return vehicleNumber;
    }
    public String gettype(){
        return type;
    }
    public int getrentalRAte(){
        return rentalRate;
    }
    @SuppressWarnings("unused")
    abstract int calculateRentalCost(int rentaldays);
    public void displayDetails(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("VEhicle type: "+type);
        System.out.println("Rental rate: "+rentalRate);
    }
}
interface Insurable{
    int calculateInsurance();
    String getInsurancedetails();
}
class Car extends Vehicle implements Insurable{
    public Car(int vehicleNumber,String type,int rentalRate){
        super(vehicleNumber, type, rentalRate);
    }
    @Override
    public int calculateRentalCost(int rentaldays){
        return rentaldays*rentalRate;
    }
    @Override
    public int calculateInsurance(){
        return (int)(rentalRate*0.05);
    }
    @Override
    public String getInsurancedetails(){
        return "Car: 5%";
    }
}
class Bike extends Vehicle implements Insurable{
    public Bike(int vehicleNumber,String type,int rentalRate){
        super(vehicleNumber, type, rentalRate);
    }
    @Override
    public int calculateRentalCost(int rentaldays){
        return rentaldays*rentalRate;
    }
    @Override
    public int calculateInsurance(){
        return (int) (rentalRate*0.10);
    }
    @Override
    public String getInsurancedetails(){
        return "Bike: 10%";
    }
}
class Truck extends Vehicle implements Insurable{
    public Truck(int vehicleNumber,String type,int rentalRate){
        super(vehicleNumber, type, rentalRate);
    }
    @Override
    public int calculateRentalCost(int rentaldays){
        return rentaldays*rentalRate;
    }
    @Override
    public int calculateInsurance(){
        return (int)(rentalRate*0.15);
    }
    @Override
    public String getInsurancedetails(){
        return "Truck: 15%";
    }
}
public class VehicleRent{
    public static void main(String[] args) {
        Car c1=new Car(1452,"Audi",3000);
        Bike b1=new Bike(1025,"hero Honda",200);
        Truck t1=new Truck(9654,"Tata",1500);
        System.out.println("--------Vehicle 1---------");
        c1.displayDetails();
        System.out.println(c1.calculateRentalCost(2));
        System.out.println(c1.calculateInsurance());
        System.out.println(c1.getInsurancedetails());
        System.out.println("--------Vehicle 2---------");
        b1.displayDetails();
        System.out.println(b1.calculateRentalCost(3));
        System.out.println(b1.calculateInsurance());
        System.out.println(b1.getInsurancedetails());
        System.out.println("--------Vehicle 3---------");
        t1.displayDetails();
        System.out.println(t1.calculateRentalCost(2));
        System.out.println(t1.calculateInsurance());
        System.out.println(t1.getInsurancedetails());
    }
}