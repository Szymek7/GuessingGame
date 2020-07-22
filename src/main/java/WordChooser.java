import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordChooser {


    public String getChoosenWord(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        String[] filmNames = new String[25];
        int i = 0;
        while (scan.hasNextLine()) {
            filmNames[i] = scan.nextLine();
            i++;
        }
        return filmNames[(int) (Math.random() * filmNames.length)];
    }
}
