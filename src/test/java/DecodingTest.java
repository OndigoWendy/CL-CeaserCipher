import static org.junit.Assert.*;
import org.junit.*;


public class DecodingTest {
    private String inputText = "AIRHC";
    private int shiftKey = 4;
    Decoding testDecoding = new Decoding(shiftKey, inputText);

    @Test
    public void objectInstanceCreated() {
        assertEquals(true, testDecoding instanceof Decoding);
    }

    @Test
    public void inputText_isUpperCase() {
        String inputText = "abc";
        assertEquals("ABC", inputText.toUpperCase());
    }

    @Test
    public void shiftKeyIsSaved() {
        assertEquals(4, testDecoding.shiftKey());
    }
    @Test public void setInputTextIsSaved(){
        assertEquals("AIRHC",testDecoding.inputText());
    }
    @Test public void inputIsNotEmpty(){
        assertEquals(true,testDecoding.isNotEmpty());
    }
    @Test public void setInputTextIsValid(){
        assertEquals(true,testDecoding.inputTextIsValid());
    }
    @Test public void setShiftKeyIsValid(){
        assertEquals(true,testDecoding.ShiftKeyIsValid());
    }
}




//    @Test public void decodingTechniqueIsValid(){
//        assertEquals("AIRHC",testDecoding.encode());
//    }
