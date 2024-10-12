public class Magazine extends LibraryItem implements Loanable{
    boolean isLoaned = false;
    public Magazine(String title, String author){
        super(title,author);
    }
    @Override
    public void displayInfo(){
        System.out.println("The magazine title is: "+getTitle()+" The author is: "+getAuthor());
    }
    @Override
    public void loanItem(){
        if(!isLoaned) {
            System.out.println("The magazine which loaned is : "+getTitle()+ " And the author is "+getAuthor());
            isLoaned = true;
        } else {
            System.out.println(getTitle()+" is already loaned");
        }

    }
    @Override
    public void returnItem(){
        System.out.println("The magazine which returned is : "+getTitle()+ " And the author is "+getAuthor());

    }
}
