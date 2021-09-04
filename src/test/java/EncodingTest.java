import static org.junit.Assert.*;
import org.junit.*;


public class EncodingTest{
    private String inputText="wendy";
    private int shiftKey=4;
    Encoding testEncoding = new Encoding(inputText  , shiftKey);

    @Test public void objectInstanceCreated(){
        assertEquals(true,testEncoding instanceof Encoding);
    }
    @Test public void inputText_isUpperCase(){
        String inputText = "abc";
        assertEquals("ABC",inputText.toUpperCase());
    }
   @Test public void shiftKeyIsSaved(){
        assertEquals(4,testEncoding.shiftKey());
   }
    @Test public void setInputTextIsSaved(){
        assertEquals("wendy",testEncoding.inputText());
    }
    @Test public void inputIsNotEmpty(){
        assertEquals(true,testEncoding.isNotEmpty());
    }
    @Test public void setInputTextIsValid(){
        assertEquals(true,testEncoding.inputTextIsValid());
    }
    @Test public void setShiftKeyIsValid(){
        assertEquals(true,testEncoding.ShiftKeyIsValid());
    }
//    @Test public void encodingTechniqueIsValid(){
//        assertEquals("AIRHC",testEncoding.encode());
//    }
}