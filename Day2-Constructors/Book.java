class Book{
    String title;
    String author;
    int price;
    Book(){  //Default constuctor
        title="My life";
        author="Sasanka";
        price=1000;
    }
    public Book(String title, String author, int price) {  //parametarized constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }
     void DisplayDetails(){
        System.out.println("Title :"+title+", Author: "+author+", price:"+price);
     }
     public static void main(String[] args) {
         Book book1=new Book();
         Book book2=new Book("Faith in god","Abhinaya",1500);
         System.out.println("Details of book 1----");
         book1.DisplayDetails();
         System.out.println("Details of book 2----");
         book2.DisplayDetails();
     }
}