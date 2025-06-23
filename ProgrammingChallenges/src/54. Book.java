//Create a Book class for a library system.
//Instance variables: title, author, isbn.
//Static variables: totalBooks, a counter for the total number of book instances.
//Instance methods:borrowBook(), returnBook()
//Static method: getTotalBooks(), to get the total number of books in the library.

class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        //Object Initializer
        totalBooks++;
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this("Unknown", "Unknown" , isbn);
    }

    void borrowBook(){
        if(this.isBorrowed){
            System.out.println("Sorry"+ this.title+"is not available right now. You can take another book.");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy" + this.title + "Book");
            totalBooks--;
        }
    }

    void returnBook(){
        if(this.isBorrowed){
            totalBooks++;
            this.isBorrowed=false;
            System.out.println("Hope You have enjoyed!!! Please give your review about"+this.title + "Book");
        }else{
            System.out.println("Yes" +this.title+ "book is available.");
        }
    }

    public static void main(String[] args) {
         Book book1 = new Book("XYZ", "ABC","xyz123" );
         Book book2 = new Book("pqr123");
         System.out.println("Your Total no of Books are: " +getTotalBooks());
         book1.borrowBook();
         book2.borrowBook();
         System.out.println("Your Total no of Books are: " +getTotalBooks());
         book1.returnBook();
         System.out.println("Your Total no of Books are: " +getTotalBooks());
         book2.borrowBook();
         book2.returnBook();
         book2.borrowBook();
         book1.borrowBook();
         book1.borrowBook();
    }
}
