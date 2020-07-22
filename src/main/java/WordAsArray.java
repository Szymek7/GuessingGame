import java.lang.reflect.Array;

public class WordAsArray {
    private int charLeft;

    public char[] wordAsArray(String choosenWord) {

        char[] ch = new char[choosenWord.length()];
        for (
                int z = 0; z < choosenWord.length(); z++) {
            ch[z] = choosenWord.charAt(z);

        }
        return ch;
    }

    public char[] wordAsUnderscores (String choosenWord) {
        char[] underscores = new char[choosenWord.length()];
            for (int z = 0; z < choosenWord.length(); z++) {
                underscores[z] = choosenWord.charAt(z);
                if (underscores[z] == ' ') {
                    //do nothing
                } else {
                    underscores[z] = '_';
                }
            }
            return underscores;
        }
        public int chances (char[] enterArray){
        for (int z = 0; z < enterArray.length; z++) {
            if (enterArray[z] == '_') {
                charLeft++;
            }
        }
        return charLeft;
        }


    }
