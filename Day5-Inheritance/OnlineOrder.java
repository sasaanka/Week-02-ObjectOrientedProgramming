class Order{
    int orderId;
    String orderDate;
    public Order(int orderId,String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus(){
        return "Order placed";
    }
    @Override
    public String toString(){
        return "OrderId: "+orderId+ "\nOrder Date: "+orderDate+ "\nOrder Status: "+getOrderStatus();
    }
}
class ShippedOrder extends Order{
    int trackingnum;
    public ShippedOrder(int orderId, String orderDate,int trackingnum){
        super(orderId, orderDate);
        this.trackingnum=trackingnum;
    }
    @Override
    public String getOrderStatus(){
        return "Order Shipped (Tracking No: " + trackingnum + ")";
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliverydate;
    public DeliveredOrder(int orderId, String orderDate,int trackingnum,String deliverydate){
        super(orderId, orderDate, trackingnum);
        this.deliverydate=deliverydate;
    }
    @Override
    public String getOrderStatus(){
        return "Order delivery on (Delivery Date: " + deliverydate+" ) ";
    }
}
public class OnlineOrder{
    public static void main(String[] args) {
        Order o1=new Order(15423,"12/02");
        System.out.println("--------Order 1-------");
        System.out.println(o1);
        
        Order o2=new DeliveredOrder(12486,"2/12",1548762,"10/12");
        System.out.println("--------Order 2-------");
        System.out.println(o2);
    }
}