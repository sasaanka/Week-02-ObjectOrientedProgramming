class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    int costperday;
    CarRental(){
        customerName="Abhinaya";
        carModel="Ford";
        rentalDays=3;
        costperday=1000;
    }
    public CarRental(String customerName, String carModel, int rentalDays,int costperday) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costperday= costperday;
    }
    public int totalcost(int costperday){
        return rentalDays*costperday;
    }
    void displaydetails(){
        System.out.println("Customer name is "+customerName);
        System.out.println("Car model is "+carModel);
        System.out.println("The days for rent "+rentalDays);
        System.out.println("Totalcost for "+rentalDays+" is "+totalcost(costperday));
    }
    public static void main(String[] args) {
        CarRental cus1=new CarRental("sasanka","Benz",3,5000);
        CarRental cus2=new CarRental("Bharath","Audi",5,6000);
        CarRental cus3=new CarRental();
        System.out.println("-----Details of customer 1-----");
        cus1.displaydetails();
        System.out.println("-----Details of customer 2-----");
        cus2.displaydetails();
        System.out.println("-----Details of customer 3-----");
        cus3.displaydetails();
    }
}