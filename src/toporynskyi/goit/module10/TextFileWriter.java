package toporynskyi.goit.module10;

import toporynskyi.goit.module09.TextEncryption;

import java.io.*;

/**
 * Created by grant on 6/22/16.
 */
public class TextFileWriter {

    private BufferedReader writing(BufferedWriter bwriter){
        String text;
        try (BufferedReader breader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(text = breader.readLine()).equals("Exit")) {
                String enText = TextEncryption.encode(text);
                bwriter.write(enText + "\n");
                bwriter.flush();
            }
        }catch (Exception e){
            System.err.println("Error! Can`t write to file.");
        }
        return null;
    }

    private void reading(FileReader fileTarget){
        String text;
        try (BufferedReader fileReader = new BufferedReader(fileTarget)) {
            while ((text = fileReader.readLine()) != null) {
                String deText = TextEncryption.decode(text);
                System.out.print("\n" + deText);
            }
        } catch (Exception e){
            System.err.println("Error! Can`t read from file.");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedWriter bwriter = new BufferedWriter(new FileWriter("../GoJava/src/toporynskyi/goit/module10/TextIOFile.txt"));
        TextFileWriter write = new TextFileWriter();
        write.writing(bwriter);

        FileReader fileTarget  = new FileReader("../GoJava/src/toporynskyi/goit/module10/TextIOFile.txt");
        TextFileWriter reader = new TextFileWriter();
        reader.reading(fileTarget);
    }
}
