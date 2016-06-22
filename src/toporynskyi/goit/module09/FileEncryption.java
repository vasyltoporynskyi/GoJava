package toporynskyi.goit.module09;

import toporynskyi.goit.module08.myCollections.files.*;

/**
 * Created by grant on 6/22/16.
 */
class FileEncryption {

    private static int SHIFT = 4;

    static void encode(File file) {
        StringBuilder name = new StringBuilder(file.getName());
        for (int i = 0; i < name.length(); i++) {
            char a = name.charAt(i);
            a = (char) (a + SHIFT);
            name.setCharAt(i, a);
        }
        file.setName(name.toString());
    }

    static void decode(File file) {
        StringBuilder name = new StringBuilder(file.getName());
        for (int i = 0; i < name.length(); i++) {
            char a = name.charAt(i);
            a = (char) (a - SHIFT);
            name.setCharAt(i, a);
        }
        file.setName(name.toString());
    }
}
