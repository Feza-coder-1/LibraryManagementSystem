//Implement subclasses like Book, Magazine, and Newspaper that extend LibraryItem and implement displayInfo().

public class Book extends LibraryItem implements Loanable {
    boolean isLoaned = false;
    public Book (String title, String author){
        super(title,author);
    }
    @Override
    public void displayInfo(){
        System.out.println("The book title is: "+getTitle()+" The author is: "+getAuthor());
        System.out.println("Status: "+isLoaned);
    }

    @Override
    public String getCSVformat() {
        return this.getClass().getSimpleName()+","+getTitle()+","+getAuthor()+","+isLoaned;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    @Override
    public void loanItem(){
        if(!isLoaned) {
            System.out.println("The Book which loaned is : "+getTitle()+ " And the author is "+getAuthor());
            isLoaned = true;
        } else {
            System.out.println(getTitle()+" is already loaned");
        }

    }

    @Override
    public void returnItem(){
        if(isLoaned) {
            System.out.println("The book which returned is : "+getTitle()+ " And the author is "+getAuthor());
            isLoaned = false;
        } else {
            System.out.println(getTitle()+" is not yet loaned");
        }
    }
}
