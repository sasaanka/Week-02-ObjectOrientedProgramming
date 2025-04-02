class LibraryManagSystem{
    static String libraryName="Central library";
    String title;
    String author;
    final String ISBN;
    LibraryManagSystem(String title,String author,String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    static void displayLibraryname(){
        System.out.println("Libarary name is "+libraryName);
    }
    void displaydetails(){
        System.out.println("Enter title of the book: "+title);
        System.out.println("The author of the book is "+author);
        System.out.println("ISBN : "+ISBN);
    }
    public static void main(String[] args) {
        LibraryManagSystem l1=new LibraryManagSystem("My life", "sasanka", "123443");
        l1.displaydetails();
        LibraryManagSystem.displayLibraryname();
    }
}