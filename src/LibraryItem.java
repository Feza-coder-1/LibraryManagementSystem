import java.util.Objects;

//2. Library Management System
//Concepts: Inheritance, file handling, abstract classes, interfaces.
//        Description:
//Create an abstract class LibraryItem with fields like title, author, and abstract methods such as displayInfo().
//Implement subclasses like Book, Magazine, and Newspaper that extend LibraryItem and implement displayInfo().
//Create an interface Loanable with methods like loanItem() and returnItem(), which will be implemented by Book and Magazine but not by Newspaper.
//Use file handling to store and retrieve library items from a text file or binary file.
public abstract class LibraryItem {
    private String title;
    private String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void displayInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryItem that = (LibraryItem) o;
        return Objects.equals(title, that.title) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
