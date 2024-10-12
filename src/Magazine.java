public class Magazine extends LibraryItem implements Loanable{
    public Magazine(String title, String author){
        super(title,author);
    }
    @Override
    public void displayInfo(){
        System.out.println("The magazine title is: "+getTitle()+" The author is: "+getAuthor());
    }
    @Override
    public void loanItem(){
        System.out.println("The magazine which loaned is : "+getTitle()+ " And the author is "+getAuthor());
    }
    @Override
    public void returnItem(){
        System.out.println("The magazine which returned is : "+getTitle()+ " And the author is "+getAuthor());

    }
}
