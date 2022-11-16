import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {
        String fileName = "file does not exist.java";
        File file = new File(fileName);
        try {
            FileInputStream stream = new FileInputStream(file); // this is checked exception this will be checked at compile time
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of code ");
    }
}
