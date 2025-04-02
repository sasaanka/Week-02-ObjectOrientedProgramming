class Vehicle{
    int maxSpeed;
    String model;
    public Vehicle(int maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    public void displayInfo(){
        System.out.println("Maximum speed: "+maxSpeed);
        System.out.println("Vehicle model: "+model);
    }
}
interface Refuelable{
    void refuel();
}
class ElectricVehicle extends Vehicle{
    public ElectricVehicle(int maxSpeed,String model){
        super(maxSpeed, model);
    }
    public void charge(){
        System.out.println(model+ " is charging");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    public PetrolVehicle(int maxSpeed,String model){
        super(maxSpeed, model);
    }
    @Override
    public void refuel(){
        System.out.println(model+ " is refuealable.");
    }
}
public class VehicleMan{
    public static void main(String[] args) {
        ElectricVehicle v1=new ElectricVehicle(150,"Tesla ");
        PetrolVehicle v2=new PetrolVehicle(120,"Honda");
        System.out.println("-------vehicle 1--------");
        v1.displayInfo();
        v1.charge();
        System.out.println("--------vehicle 2-------");
        v2.displayInfo();
        v2.refuel();
    }
}
