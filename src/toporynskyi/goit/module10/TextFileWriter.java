package toporynskyi.goit.module10;

import toporynskyi.goit.module09.TextEncryption;

import java.io.*;

/**
 * Created by grant on 6/22/16.
 */
public class TextFileWriter {

    private void writing() throws IOException {
        try {
            BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bwriter = new BufferedWriter(new FileWriter("../GoJava/src/toporynskyi/goit/module10/TextIOFile.txt"));
            String text;

            while (!(text = breader.readLine()).equals("Exit")) {
                String enText = TextEncryption.encode(text);
                bwriter.write(enText + "\n");
                bwriter.flush();
            }
            bwriter.close();
        } catch (IOException e) {
            System.err.println("Error writing to file TextIOFile.txt");
        }


    }

    String s = " " + 10;


    private void reading() throws IOException {

        try (BufferedReader fileReader = new BufferedReader(new FileReader("../GoJava/src/toporynskyi/goit/module10/TextIOFile.txt"))) {
            String text;

            while ((text = fileReader.readLine()) != null) {
                String deText = TextEncryption.decode(text);
                System.out.print("\n" + deText);
            }
            fileReader.close();
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }


    public static void main(String[] args) throws IOException {

        TextFileWriter write = new TextFileWriter();
        write.writing();

        TextFileWriter reader = new TextFileWriter();
        reader.reading();
    }
}
