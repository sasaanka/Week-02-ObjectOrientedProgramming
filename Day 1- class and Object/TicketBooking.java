class TicketBooking{
    String moviename;
    int seatNumber;
    int price;
    boolean isbooked;

    public TicketBooking(String moviename, int price) {
        this.moviename = moviename;
        this.price = price;
        this.seatNumber = -1; 
        this.isbooked = false;
    }
    public boolean bookticket(int seatNumber){
        if (!isbooked){
            this.seatNumber=seatNumber;
            this.isbooked=true;
            System.out.println("The ticket is booked successfully for seat "+seatNumber);
            return true;
        }else{
            System.out.println("The seat is already booked");
            return false;
        }
    }
    void DisplayDetails(){
        System.out.println("Movie name is "+moviename);
        if (isbooked){
        System.out.println("seat number is "+seatNumber);
        System.out.println("Price is "+price);
        }else{
            System.out.println("Ticket is not booked yet");
        }
    }
    public static void main(String[] args) {
        TicketBooking tic1=new TicketBooking("Court",  200);
        TicketBooking tic2=new TicketBooking("sweet heart", 200);
        System.out.println("-----The details of ticket 1------ ");
        tic1.bookticket(10);
        tic1.DisplayDetails();
        System.out.println("\n-----The details of ticket 2------ ");
        tic2.bookticket(11);
        tic2.DisplayDetails();
    }
}