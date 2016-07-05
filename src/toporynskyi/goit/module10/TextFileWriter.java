package toporynskyi.goit.module10;

import toporynskyi.goit.module09.TextEncryption;

import java.io.*;

/**
 * Created by grant on 6/22/16.
 */
public class TextFileWriter {

    public BufferedReader writing(String sbwriter){
        String text;
        try (BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bwriter = new BufferedWriter(new FileWriter(sbwriter))) {
            while (!(text = breader.readLine()).equals("Exit")) {
                String enText = TextEncryption.encode(text);
                bwriter.write(enText + "\n");
            }
        }catch (Exception e){
            System.err.println("Error! Can`t write to file.");
        }
        return null;
    }

    public void reading(String sfileTarget){
        String text;
        try (FileReader fileTarget  = new FileReader(sfileTarget);
                BufferedReader fileReader = new BufferedReader(fileTarget)) {
            while ((text = fileReader.readLine()) != null) {
                String deText = TextEncryption.decode(text);
                System.out.print("\n" + deText);
            }
        } catch (Exception e){
            System.err.println("Error! Can`t read from file.");
        }
    }

    public static void main(String[] args) throws IOException {

        String sbwriter = "../GoJava/src/toporynskyi/goit/module10/TextIOFile.txt";
        TextFileWriter write = new TextFileWriter();
        write.writing(sbwriter);

        String sfileTarget = "../GoJava/src/toporynskyi/goit/module10/TextIOFile.txt";
        TextFileWriter reader = new TextFileWriter();
        reader.reading(sfileTarget);
    }
}
