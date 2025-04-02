class TrackofItems{
    int itemCode;
    String itemName;
    int price;

    public TrackofItems() {
        itemCode=120;
        itemName="Mangoes";
        price=20;
    }
    public TrackofItems(int itemCode,String itemName, int price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    public double Caluclatecost(int quantity){
        return price*quantity;
    }
    public void DisplayDetails(){
        System.out.println("Itemcode: "+itemCode);
        System.out.println("Item Name: "+itemName);
        System.out.println("Price per unit: "+price);
    }
    public static void main(String[] args) {
        TrackofItems item1=new TrackofItems();
        TrackofItems item2=new TrackofItems(100,"Grapes",80);
        TrackofItems item3=new TrackofItems(110,"Watermelon",60);
        System.out.println("The details of Item 1");
        item1.DisplayDetails();
        int quantity=3;
        double totalcost=item1.Caluclatecost(quantity);
        System.out.println("The total cost is "+totalcost);
        System.out.println("\nThe details of Item 2");
        item2.DisplayDetails();
        double totalcost2=item2.Caluclatecost(quantity);
        System.out.println("The total cost is "+totalcost2);
        System.out.println("\nThe details of Item 3");
        item3.DisplayDetails();
        double totalcost3=item3.Caluclatecost(quantity);
        System.out.println("The total cost is "+totalcost3);

    }
    
}