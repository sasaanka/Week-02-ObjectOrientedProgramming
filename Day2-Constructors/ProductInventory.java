class ProductInventory{
    static int totalproducts=0;
    String productName;
    int price;
    public ProductInventory(String productName,int price){
        this.productName=productName;
        this.price=price;
        totalproducts++;
    }
    void  displayProductDetails(){
        System.out.println("The product is "+productName+" and the price is "+price);
    }
    static void displayTotalProducts(){
        System.out.println("The total products is "+totalproducts);
    }
    public static void main(String[] args) {
        ProductInventory p1=new ProductInventory("Apple",100);
        ProductInventory p2=new ProductInventory("Banana",90);
        System.out.println("Product details----");
        p1.displayProductDetails();
        p2.displayProductDetails();
        ProductInventory.displayTotalProducts();
    }
}