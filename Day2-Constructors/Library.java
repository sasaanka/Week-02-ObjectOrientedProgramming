class book{
    public String ISBN;
    protected String title;
    private String author;

    public book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String setAuthorname(){
        return author;
    }
    public void getAuthorname(String author){
        this.author=author;
    }
    public void displaydetails(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("Title of the book: "+title);
        System.out.println("Author of the book: "+author);
    }
}
class Ebook extends book{
    double filesize;
    public Ebook(String ISBN,String title,String author,double filesize){
        super(ISBN,title,author);
        this.filesize=filesize;
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("File Size: "+filesize);
    }
}
public class Library{
    public static void main(String[] args) {
        book b1=new book("978-3-16-148410-0", "Java Programming", "John Doe");
        b1.displaydetails();
        System.out.println("\nUpdating author name");
        b1.getAuthorname("Sasanka");
        b1.displaydetails();
        System.out.println("------Ebook details-----");
        Ebook ebook1 = new Ebook("978-1-23-456789-7", "Python for Beginners", "Alice Smith", 2.5);
        ebook1.displaydetails();
    }
}
