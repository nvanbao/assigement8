package assigement8;

import java.util.*;

public class removespaceinstring {

    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.println("String after remove space: \"" + removeExtraSpaces(input) + "\"");

    }
}
