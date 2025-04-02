class Book{
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displaydetails(){
        System.out.println("Title of the book: "+title);
        System.out.println("Published in the year: "+publicationYear);
    }
}
class Author extends Book{
    String name;
    int age;
    public Author(String name, int age, String title, int publicationYear) {
        super(title, publicationYear);
        this.name = name;
        this.age = age;
    }
    @Override
    void displaydetails(){
      
        System.out.println("Author's name: "+name);
        System.out.println("Author's age: "+age);
        super.displaydetails();
    }
}
public class BookSystem{
    public static void main(String[] args) {
        Book b1=new Author("Sasanka",30,"My life",2030);
        Book b2=new Author("Abhinaya",35,"The art of being human",2040);
        System.out.println("------Book 1--------");
        b1.displaydetails();
        System.out.println("-------Book 2---------");
        b2.displaydetails();
    }
}