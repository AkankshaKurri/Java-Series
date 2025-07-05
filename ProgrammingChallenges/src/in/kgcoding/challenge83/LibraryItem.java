//Start with a base class LibraryItem that includes common attributes like
//itemID, title, and author, and metods like checkout() and returnItem().
//Create subclasses such as Book, Magazine, and DVD, each inheriting from LibraryItem.
//Add unique attributes to each subclass, like ISBN for Book, issueNumber for Magazine,
//and duration for DVD.

package in.kgcoding.challenge83;

public class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isIssued;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        isIssued = false;
    }

    //Agar kisine item library se le liye toh
    //isIssued ko true karenge

    //Agar kisine book nhi liya toh
    //isIssued false rahega

    //Agar isIssued true rahega toh "ITEM NOT available"
    //Agar isIssued false rahega toh "ITEM availble"


    public void issueItem(){
        if(isIssued){
            System.out.println("Item not available");
        }
        else{
            System.out.println("Item Issued successfully");
            isIssued = true;
        }
    }

    protected void returnItem(){
        if(isIssued){
            System.out.println("Item returned successfully");
            isIssued = false;
        }else{
            System.out.println("Sorry !! That book is already available in library");
        }
    }

    protected void displayDetails(){
        System.out.println("Item Id:"+ this.itemId);
        System.out.println("Title:"+ this.title);
        System.out.println("Author:"+ this.author);
    }
}
