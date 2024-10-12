import java.io.*;
import java.util.List;

public class FileImplementations implements FileOperations{
    @Override
    public List<LibraryItem> readFromFile(String filename) {
        List<LibraryItem> libraryItems;

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;

            while ((line = reader.readLine())!=null) {

            }

        }catch (IOException e) {
            System.out.println("Error: " +e.getMessage());
        }
    }

    @Override
    public void writeToFile(String filename, List<LibraryItem> libraryItems) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (LibraryItem libraryItem: libraryItems) {
                writer.write(libraryItem.getCSVformat());
                writer.newLine();
            }

        }catch (IOException e) {
            System.out.println("Error: " +e.getMessage());
        }
    }
}
