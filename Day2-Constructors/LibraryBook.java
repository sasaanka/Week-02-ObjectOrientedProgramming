class LibraryBook{
    String title;
    String author;
    int price;
    boolean isavailable;
    LibraryBook(String title,String author,int price,boolean isavailable){
        this.title=title;
        this.author=author;
        this.price=price;
        this.isavailable=isavailable;
    }
    void borrowbook(){
        if (isavailable){
            System.out.println("You have borrowed the book "+title);
            isavailable=false;
        }else{
            System.out.println("The Book "+title+" is not available");
        }
    }
    void displaydetails(){
        System.out.println("The book "+title+" which is written by "+author+" is of price "+price+" is available "+isavailable);
    }
    public static void main(String[] args) {
        LibraryBook book1=new LibraryBook("The wings of fire ","Abdul kalam", 1500,true);
        LibraryBook book2=new LibraryBook("The art of being human ","Sasanka", 2500,false);
        book1.displaydetails();
        book2.displaydetails();
        book1.borrowbook();
        book2.borrowbook();
        System.out.println("The updated availability of the books ");
        book1.displaydetails();
        book2.displaydetails();
    }
}