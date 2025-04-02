class Device{
    int deviceId;
    String deviceStatus;
    public Device(int deviceId, String deviceStatus) {
        this.deviceId = deviceId;
        this.deviceStatus = deviceStatus;
    }
    void displayStatus(){
        System.out.println("Devide id: "+deviceId);
        System.out.println("Device Status: "+deviceStatus);
    }
}
class Thermostat extends Device{
    int tempSettings;
    public Thermostat(int tempSettings, int deviceId, String deviceStatus) {
        super(deviceId, deviceStatus);
        this.tempSettings = tempSettings;
    }
    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature is at "+tempSettings);
    }
}
public class SmartHome{
    public static void main(String[] args) {
        System.out.println("-------Device 1------");
        Device d1=new Thermostat(150,1523,"Running");
        d1.displayStatus();
        System.out.println("-------Device 2------");
        Device d2=new Device(1420,"Failed");
        d2.displayStatus();
    }
}