abstract class Product{
    int productId;
    String name;
    int price;
    public Product(int productId,String name,int price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    
    public abstract int caluclateDiscount();
    public void displayDetails(){
        System.out.println("Product ID: "+productId);
        System.out.println("Product name: "+name);
        System.out.println("Product price: "+price);
    }
}
interface Taxable{
    int calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable{
    public Electronics(int productId,String name,int price){
        super(productId, name, price);
    }
    @Override
    public int caluclateDiscount(){
        return (int) (price*0.30);
    }
    @Override
    public int calculateTax(){
        return (int)(price*0.15);
    }
    @Override
    public String getTaxDetails(){
        return "Electronics: 15% tax";
    }
}
class Clothing extends Product implements Taxable{
    public Clothing(int productId,String name,int price){
        super(productId, name, price);
    }
    @Override
    public int caluclateDiscount(){
        return (int)(price*0.13);
    }
    @Override
    public int calculateTax(){
        return (int)(price*20);
    }
    @Override
    public String getTaxDetails(){
        return "Clothing: 20% tax";
    }
}
class Groceries extends Product implements Taxable{
    public Groceries(int productId,String name,int price){
        super(productId, name, price);
    }
    @Override
    public int caluclateDiscount(){
        return (int)(price*0.20);
    }
    @Override
    public int calculateTax(){
        return (int)(price*0.05);
    }
    @Override
    public String getTaxDetails(){
        return "Groceries: 5% tax";
    }
}
public class EcommercePlatform{
    public static void main(String[] args) {
        Electronics e1=new Electronics(15422,"Mobile",50000);
        Clothing c1=new Clothing(14785,"tops",1000);
        Groceries g1=new Groceries(52693,"Cashew",200);
        System.out.println("-------------");
        e1.caluclateDiscount();
        e1.displayDetails();
        System.out.println("Price with tax is: "+e1.calculateTax());
        System.out.println(e1.getTaxDetails());
        System.out.println("-------------");
        c1.caluclateDiscount();
        c1.displayDetails();
        System.out.println("Price with tax is: "+c1.calculateTax());
        System.out.println(c1.getTaxDetails());
        System.out.println("-------------");
        g1.caluclateDiscount();
        g1.displayDetails();
        System.out.println("Price with tax is: "+g1.calculateTax());
        System.out.println(g1.getTaxDetails());
    }
}