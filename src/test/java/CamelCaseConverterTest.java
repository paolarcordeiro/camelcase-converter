import org.junit.Test;
import static org.junit.Assert.*;

public class CamelCaseConverterTest {

    @Test
    public void testConvertSingleWord() {
        assertEquals("hello", CamelCaseConverter.convert("hello"));
    }

    @Test
    public void testConvertTwoWords() {
        assertEquals("helloWorld", CamelCaseConverter.convert("hello world"));
    }

    @Test
    public void testConvertMultipleWords() {
        assertEquals("thisIsATest", CamelCaseConverter.convert("this is a test"));
    }

    @Test
    public void testLeadingAndTrailingSpaces() {
        assertEquals("leadingSpaces", CamelCaseConverter.convert(" leading spaces "));
        assertEquals("trailingSpaces", CamelCaseConverter.convert("trailing spaces "));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", CamelCaseConverter.convert(""));
    }

    @Test
    public void testNullInput() {
        assertThrows(NullPointerException.class, () -> {
            CamelCaseConverter.convert(null);
        });
    }
}