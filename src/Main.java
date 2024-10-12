import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Book harryBook = new Book("Harry potter", "Prince");
        Book book2 = new Book("Book2title", "Author2");
        Magazine magazine1 = new Magazine("magazine2title", "Magazine2");
        Newspaper newspaper = new Newspaper("Uganda pearl", "News Vision group");
        List<LibraryItem> libraryItems = new ArrayList<>(List.of(harryBook, book2, magazine1, newspaper));

        FileOperations fileoperations = new FileImplementations();
        fileoperations.writeToFile("library.csv", libraryItems);
    }
}
