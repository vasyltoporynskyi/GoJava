package toporynskyi.goit.module10;

import toporynskyi.goit.module09.TextEncryption;

import java.io.*;

/**
 * Created by grant on 6/22/16.
 */
public class TextFileWriter {

    private BufferedReader writing(BufferedWriter bwriter, BufferedReader breader) {
        String text;
        try {
            while (!(text = breader.readLine()).equals("Exit")) {
                String enText = TextEncryption.encode(text);
                bwriter.write(enText + "\n");
                bwriter.flush();
            }
            bwriter.close();
        } catch (IOException e) {
            System.err.println("Error writing to file TextIOFile.txt");
        }
        return null;
    }

    private void reading(BufferedReader fileReader){
        String text;
        try{
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

        BufferedWriter bwriter = new BufferedWriter(new FileWriter("../GoJava/src/toporynskyi/goit/module10/TextIOFile.txt"));
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));

        TextFileWriter write = new TextFileWriter();
        write.writing(bwriter, breader);

        BufferedReader fileReader = new BufferedReader(new FileReader("../GoJava/src/toporynskyi/goit/module10/TextIOFile.txt"));

        TextFileWriter reader = new TextFileWriter();
        reader.reading(fileReader);
    }
}
