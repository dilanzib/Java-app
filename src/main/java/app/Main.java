package app;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileUtils.readTextFile("files/prospects.txt");
    }

}
