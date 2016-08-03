package core.collections.treeee3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ukr-sustavov on 02.08.2016.
 */
public class IOFile
{
    public List<String> readFromFile(List<String> currentLine, String commandPrefix) throws IOException
    {
        String fileName = "";

        for (String str : currentLine)
        {
            if (Instruction.isContained(str, commandPrefix))
            {
                continue;
            }

            fileName = str;

        }

        return Arrays.asList(new String(Files.readAllBytes(Paths.get(fileName))).replaceAll("\\r\\n", "").split(" "));
    }
}
