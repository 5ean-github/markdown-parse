import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;

public class MarkdownParseTest {
    @Test
    public void parseTestOne() throws IOException{
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        List<String> test1 = List.of("a link on the first line");
        assertEquals("test 1", test1, MarkdownParse.getLinks(contents));
    }
}