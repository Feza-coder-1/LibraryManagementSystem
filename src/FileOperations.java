import java.util.List;

public interface FileOperations {

    void writeToFile(String filename, List<LibraryItem> libraryItems);
    List<LibraryItem> readFromFile(String filename);
}
