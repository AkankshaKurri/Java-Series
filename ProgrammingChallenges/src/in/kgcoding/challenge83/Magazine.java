package in.kgcoding.challenge83;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    public void displayDetails(){
        System.out.println("Here are the magazine details:");
        super.displayDetails();
        System.out.println("Issue Number:"+ issueNumber);
    }
}
