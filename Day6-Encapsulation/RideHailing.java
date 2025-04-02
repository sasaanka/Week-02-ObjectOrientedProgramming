
import java.util.*;
abstract class Vehicle{
    final private int vehicleId;
    final private String driverName;
    final private int rateperkm;
    public Vehicle(int vehicleId,String driverName,int rateperkm){
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.rateperkm=rateperkm;
    }
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return rateperkm;
    }
     public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + rateperkm);
    }
    public abstract double calculateFare(double distance);
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
class Car extends Vehicle implements GPS {
    private String location;

    public Car(int vehicleId, String driverName, int rateperkm) {
        super(vehicleId, driverName, rateperkm);
        this.location = "Garage";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(int vehicleId, String driverName, int rateperkm) {
        super(vehicleId, driverName, rateperkm);
        this.location = "Garage";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() - 5; 
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(int vehicleId, String driverName, int rateperkm) {
        super(vehicleId, driverName, rateperkm);
        this.location = "Garage";
    }

    @Override
    public double calculateFare(double distance) {
        return (distance * getRatePerKm()) + 10; 
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
public class RideHailing {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        Vehicle car = new Car(1256, "Amit", 15);
        Vehicle bike = new Bike(7890, "Ravi", 10);
        Vehicle auto = new Auto(3681, "Sita", 12);

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        double distance = 10.0;

        for (Vehicle v : rides) {
            System.out.println("---------------");
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));

            if (v instanceof GPS gps) {
                gps.updateLocation("City Center");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }
        }
    }
}