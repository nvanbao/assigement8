
package assigement8;
import java.util.*;
public class Convertuppercasetolowercaseandviceversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        StringBuilder converted = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                converted.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                converted.append(Character.toUpperCase(ch));
            } else {
                converted.append(ch);
            }
        }
        System.out.println("String after a convent: " + converted.toString());
}
}