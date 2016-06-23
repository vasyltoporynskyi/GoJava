package toporynskyi.goit.module10;

import java.io.IOException;

/**
 * Created by grant on 6/22/16.
 */
public class TextEncryption {

    private static int SHIFT = 8;

     public static String encode(String text) throws IOException {
        StringBuilder entext = new StringBuilder(text);
        for (int i = 0; i < entext.length(); i++) {
            char a = entext.charAt(i);
            a = (char) (a + SHIFT);
            entext.setCharAt(i, a);
        }
        return String.valueOf(entext);
    }

   public static String decode(String text) {
        StringBuilder detext = new StringBuilder(text);
        for (int i = 0; i < detext.length(); i++) {
            char a = detext.charAt(i);
            a = (char) (a - SHIFT);
            detext.setCharAt(i, a);
        }
        return String.valueOf(detext);
    }
}
