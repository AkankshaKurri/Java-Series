package in.kgcoding.challenge83;

public class Testing {
    public static void main(String[] args) {
        Book book = new Book("BO01", "Java Programming", "James Gosling", 10);
        Magazine magazine = new Magazine("M001", "Science Today", "XYZ", 20);
        DVD dvd = new DVD("D001", "The Matrix", "ABC", 3600);
        book.displayDetails();
        book.issueItem();
        book.returnItem();
        book.returnItem();
        System.out.println();

        magazine.displayDetails();
        magazine.returnItem();
        magazine.issueItem();
        magazine.issueItem();
        magazine.returnItem();
        System.out.println();

        dvd.displayDetails();
        dvd.issueItem();
        dvd.issueItem();
        dvd.returnItem();
        dvd.returnItem();
    }
}
