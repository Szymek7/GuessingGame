import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) throws FileNotFoundException {
        int chances = 10;
        int charLeft = 0;
        Scanner input = new Scanner(System.in);

        File file = new File("list.txt");
        WordChooser word = new WordChooser();
        String choosenWord = word.getChoosenWord(file);

        WordAsArray arrays = new WordAsArray();
        char[] ch = arrays.wordAsArray(choosenWord);
        char[] underscores = arrays.wordAsUnderscores(choosenWord);
        charLeft = arrays.chances(underscores);

        System.out.println();

        while(chances > 0) {
            System.out.println("Pozostało jeszcze " + chances + " szans");
            System.out.println("Tytuł filmu:");

            for (char c : underscores) {
                System.out.print(c);
            }
            System.out.println();

            char inputChar = input.nextLine().charAt(0);

            if (!String.valueOf(underscores).contains(Character.toString(inputChar))) {
                int hits = 0;
                for (int z = 0; z < choosenWord.length(); z++) {
                    if (ch[z] == inputChar) {
                        underscores[z] = inputChar;
                        hits++;
                        charLeft--;
                    }
                }
                if (hits <= 0) {
                    System.out.println("Nie trafiłeś, spróbuj ponownie");
                    chances--;
                }

                System.out.println();

                if (charLeft == 0) {
                    System.out.println("Wygrałeś, gratulacje!");
                    break;
                }

                if (chances == 0) {
                    System.out.println("Tym razem się nie udało, poprawna nazwa to: " + choosenWord);
                }
            }
            else
            {
                System.out.println("Podana litera była wskazana wcześniej, spróbuj czegoś nowego");

            }

        }

        }
        }



