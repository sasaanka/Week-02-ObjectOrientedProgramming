class HotelBooking{
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        guestName="Sasanka";
        roomType="Normal";
        nights=2;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking other){
        this.guestName=other.guestName;
        this.roomType=other.roomType;
        this.nights=other.nights;
    }
    void DisplayDetails(){
        System.out.println("Guest name is "+guestName+" and the room type is "+roomType+" nights stayed is "+nights);
    }
    public static void main(String[] args) {
        HotelBooking booking1= new HotelBooking();
        HotelBooking booking2=new HotelBooking("Bharath","suite",2);
        HotelBooking booking3= new HotelBooking(booking2);
        System.out.println("The details of booking 1 is ");
        booking1.DisplayDetails();
        System.out.println("The details of booking 2 is ");
        booking2.DisplayDetails();
        System.out.println("The details of booking 3 is ");
        booking3.DisplayDetails();
    }
}