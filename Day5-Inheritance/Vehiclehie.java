class Vehicle{
    int maxSpeed;
    String fuelType;
    public Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Enter the maximum speed: "+maxSpeed);
        System.out.println("The fuel type: "+fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("The seat capacity is "+seatCapacity);
    }
}
class Truck extends Vehicle{
    String TruckCompany;
    Truck(int maxSpeed,String fuelType,String TruckCompany){
        super(maxSpeed, fuelType);
        this.TruckCompany=TruckCompany;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Truck's company: "+TruckCompany);
    }
}
class Motorcycle extends Vehicle{
    int cost;
    Motorcycle(int maxSpeed,String fuelType,int cost){
        super(maxSpeed, fuelType);
        this.cost=cost;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Cost of motorcycle is : "+cost);
    }
}
public class Vehiclehie{
    public static void main(String[] args) {
        Vehicle v1=new Car(200,"Diesel",8);
        Vehicle v2=new Truck(100,"petrol","Mahindra");
        Vehicle v3=new Motorcycle(120,"Gas",150000);
        System.out.println("------vehicle 1-------");
        v1.displayInfo();
        System.out.println("-------Vehicle 2-------");
        v2.displayInfo();
        System.out.println("--------Vehicle 3-------");
        v3.displayInfo();
    }
}