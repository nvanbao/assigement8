package assigement8;

import java.util.*;

public class checkreservestring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("String " + str + " is one palindrome.");
        } else {
            System.out.println("String " + str + " not is one palindrome.");
        }
    }
}