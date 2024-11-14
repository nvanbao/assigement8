
package assigement8;
import java.util.*;
public class Countthenumberofwordsinastring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        String[] words = input.trim().split("\\s+");
        if (words.length == 0 || words[0].isEmpty()) {
            System.out.println("Number count in string: 0");
        } else {
            System.out.println("Number count in string: " + words.length);
        }

    }
}
