package toporynskyi.goit.module10.test;

import toporynskyi.goit.module09.TextEncryption;
import org.junit.*;
import toporynskyi.goit.module10.TextFileWriter;

/**
 * Created by grant on 7/1/16.
 */
public class TextFileWriterTest {

    String fileName = "../GoJava/src/toporynskyi/goit/module10/TextIOFile.txt";

    @Ignore ("Waiting user!")
    @Test(timeout = 1000)
    public void testWriting() throws Exception {
        TextFileWriter write = new TextFileWriter();
        write.writing(fileName);
    }

    @Test(timeout = 1000)
    public void testReading() throws Exception {
        TextFileWriter reader = new TextFileWriter();
        reader.reading(fileName);
    }
}