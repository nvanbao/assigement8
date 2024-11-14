package assigement8;

import java.util.*;

public class splitwordinstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        System.out.println("Mảng các từ: " + Arrays.toString(words));
    }

}
