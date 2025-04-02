class BookDetails{
    String title;
    String author;
    int price;

    public BookDetails() {
        title="The wings of wire";
        author="Abdul kalam";
        price=1500;
    }

    public BookDetails(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void DisplayDetails(){
        System.out.println("The title of the book: "+title);
        System.out.println("The author of the book: "+author);
        System.out.println("The price of the book: "+price);
    }
    public static void main(String[] args) {
        BookDetails book1=new BookDetails();
        BookDetails book2=new BookDetails("My life","Sasanka",2000);
        BookDetails book3=new BookDetails("Think big","Abhinaya",1000);
        System.out.println("Details of book 1 ");
        book1.DisplayDetails();
        System.out.println("\nDetails of book 2");
        book2.DisplayDetails();
        System.out.println("\nDetails of book 3");
        book3.DisplayDetails();
    }
    
}