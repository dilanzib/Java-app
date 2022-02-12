package app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

class FileUtilsTest {

    @Test
    void notExistingFileShouldReturnFileNotFoundException() {
        var file = new FileUtils();

        assertThrows(FileNotFoundException.class,
                () -> {
                    file.readTextFile("nofile.txt");
                });
    }

}