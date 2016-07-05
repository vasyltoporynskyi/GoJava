package toporynskyi.goit.module09.test;

import org.junit.*;
import toporynskyi.goit.module09.TextEncryption;

/**
 * Created by grant on 7/1/16.
 */
public class TextEncryptionTest {

    @Test(timeout = 1000)
    public void testEncode() throws Exception {
        String text = "GoJava 3!";
        String encodeText = TextEncryption.encode(text);
        Assert.assertEquals(encodeText, TextEncryption.encode(text));
    }

    @Test(timeout = 1000)
    public void testDecode() throws Exception {
       String text = "Java World!";
        String decodeText = TextEncryption.encode(text);
        Assert.assertEquals(text, TextEncryption.decode(decodeText));
    }
}