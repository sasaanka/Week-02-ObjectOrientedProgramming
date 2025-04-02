class MobilePhone{
    String brand;
    String model;
    int price;
    MobilePhone(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void DisplayDetails(){
        System.out.println("The brand of the mobile phone is "+brand);
        System.out.println("The model of the mobile phone is "+model);
        System.out.println("The price of the mobile phone is "+price);
    }
    public static void main(String[] args) {
        MobilePhone phone1=new MobilePhone("Samsung","S21",35000);
        MobilePhone phone2=new MobilePhone("Samsung","S25",125000);
        MobilePhone phone3= new MobilePhone("Oneplus","Nord ce",30000);
        System.out.println("The details of Phone 1");
        phone1.DisplayDetails();
        System.out.println("\nThe details of Phone 2");
        phone2.DisplayDetails();
        System.out.println("\nThe details of Phone 3");
        phone3.DisplayDetails();
    }
}