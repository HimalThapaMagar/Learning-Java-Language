import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();

        FileWriter vowel = null;
        FileWriter consonant = null;

        try {
            vowel = new FileWriter("vowel.txt", true); // Append mode
            consonant = new FileWriter("consonant.txt", true); // Append mode

            for (char c : word.toCharArray()) {
                if (isVowel(c)) {
                    vowel.write(c);
                } else if (isConsonant(c)) {
                    consonant.write(c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (vowel != null) {
                    vowel.close();
                }
                if (consonant != null) {
                    consonant.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return (c >= 'a' && c <= 'z') && !isVowel(c);
    }
}
