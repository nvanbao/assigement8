
package assigement8;
import java.util.*;
public class Counttheoccurrencesofacharacterinastring {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scanner.nextLine();
        System.out.print("enter characte: ");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("characte '" + ch + "' appear " + count + " in string \"" + str + "\".");
    }
    
}
