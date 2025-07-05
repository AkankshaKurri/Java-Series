package in.kgcoding.challenge83;

public class Book extends LibraryItem{
    private int ISBN;

    public Book(String itemId, String title, String author, int ISBN) {
        super(itemId, title, author);
        this.ISBN = ISBN;
    }

    public void displayDetails(){
        System.out.println("Here are the Book Details:");
        super.displayDetails();
        System.out.println("ISBN:"+ this.ISBN);
    }
}
