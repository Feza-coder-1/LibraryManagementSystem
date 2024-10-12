//Implement subclasses like Book, Magazine, and Newspaper that extend LibraryItem and implement displayInfo().

public class Book extends LibraryItem implements Loanable {
    public Book (String title, String author){
        super(title,author);
    }
    @Override
    public void displayInfo(){
        System.out.println("The book title is: "+getTitle()+" The author is: "+getAuthor());
    }
    @Override
    public void loanItem(){
        System.out.println("The book which loaned is : "+getTitle()+ " And the author is "+getAuthor());
    }
    @Override
    public void returnItem(){
        System.out.println("The book which returned is : "+getTitle()+ " And the author is "+getAuthor());

    }
}
