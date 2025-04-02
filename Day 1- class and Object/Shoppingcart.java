class Shoppingcart{
    String itemName;
    int price;
    int quantity;
    Shoppingcart(String itemName,int price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    public void addItem(int quantity){
        this.quantity+=quantity;
        System.out.println("Added " + quantity + " more of " + itemName + " to the cart.");
    }
    public void removeItem(int qty){
        if (qty>=quantity){
            System.out.println("Removing all items");
            this.quantity=0;
        }else{
            this.quantity-=qty;
            System.out.println(" Removed " + qty + " of " + itemName + " from the cart.");
        }
    }
    public  double totalcost(){
        return price*quantity;
    }
    public void displayitems(){
        System.out.println("Item "+itemName+"Price is "+price+"x "+quantity+"= "+totalcost());
    }
    public int getquantity(){
        return quantity;
    }
    public static void main(String[] args) {
        Shoppingcart s1=new Shoppingcart("Orange", 20, 3);
        Shoppingcart s2=new Shoppingcart("Banana", 18,6);
        s1.displayitems();
        s1.addItem(2);
        s1.displayitems();
        s2.displayitems();
    }
}