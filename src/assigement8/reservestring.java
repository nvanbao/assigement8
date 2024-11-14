package assigement8;

import java.util.*;

public class reservestring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reserve string: " + reversed);
    }
}