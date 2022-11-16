import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowingCheckedException {
    public static void method() throws FileNotFoundException
    {
        FileReader file = new FileReader("file does not exists ");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}
