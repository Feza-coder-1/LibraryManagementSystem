public class Newspaper extends LibraryItem {
    public Newspaper(String title, String author){
        super(title,author);
    }
    @Override
    public void displayInfo(){
        System.out.println("The newspaper title is "+getTitle()+ " And it is written by "+getAuthor());
    }

    @Override
    public String getCSVformat() {
        return this.getClass().getSimpleName()+","+getTitle()+","+getAuthor();
    }
}
