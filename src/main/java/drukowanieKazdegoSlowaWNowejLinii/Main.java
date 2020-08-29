package drukowanieKazdegoSlowaWNowejLinii;

import java.util.Scanner;

public class Main {
    /*Write a program that reads five words
    from the standard input and outputs each
    word in a new line. The words should be in
    the same order.*/

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1, str2, str3, str4, str5;
        str1 = scanner.next();
        str2 = scanner.next();
        str3 = scanner.next();
        str4 = scanner.next();
        str5 = scanner.next();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
