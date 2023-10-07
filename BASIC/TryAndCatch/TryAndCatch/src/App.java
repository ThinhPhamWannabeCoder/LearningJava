import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        try(FileOutputStream outputStream = new FileOutputStream("E://file_not_found.txt")) {
            outputStream.write(65);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
