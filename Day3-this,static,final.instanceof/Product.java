class Product{
    static int discount=500;
    String productName;
    int price;
    int quantity;
    final int productID;
    Product(String productName,int price,int quantity,int productID){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productID=productID;
    }
    static void updateDiscount(int newdiscount){
        discount=newdiscount;
        System.out.println("The updated discount is " + discount);
    }
    void  totalcost(){
        int total=price*quantity;
        System.out.println("Total cost (before discount): " + total);
        System.out.println("Total cost (after discount): " + (total - discount));
    }
    void displaydetails(){
        System.out.println("Product name "+productName);
        System.out.println("Price: "+price);
        System.out.println("quantity: "+quantity);
        System.out.println("Product ID: "+productID);
        System.out.println("Current Discount: " + discount);
    }
    public static void main(String[] args) {
        Product p1=new Product("Chocolate", 20, 2, 1245);
        Product.updateDiscount(5);
        p1.displaydetails();
        if (p1 instanceof Product){
            System.out.println("p1 object is instance of Product class ");
        }
        p1.totalcost();
    }
}