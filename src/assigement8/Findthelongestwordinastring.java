package assigement8;

import java.util.*;

public class Findthelongestwordinastring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        String[] words = input.trim().split("\\s+");
        if (words.length == 0 || words[0].isEmpty()) {
            System.out.println("No word in string.");
            return;
        }
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("word longest in a string: " + longestWord);

    }
}
