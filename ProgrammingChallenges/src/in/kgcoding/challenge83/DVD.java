package in.kgcoding.challenge83;

public class DVD extends LibraryItem{
    private int durationinSeconds;

    public DVD(String itemId, String title, String author, int durationinSeconds) {
        super(itemId, title, author);
        this.durationinSeconds = durationinSeconds;
    }

    @Override
    public void displayDetails() {
        System.out.println("Here are the DVD details:");
        super.displayDetails();
        System.out.println("Duration:"+ this.durationinSeconds);
    }
}
