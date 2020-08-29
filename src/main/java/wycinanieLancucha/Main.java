package wycinanieLancucha;

import java.util.Scanner;

public class Main {
   /* Write a program that reads a string, and then
   outputs the string without its middle character
   when the length is odd, and without the middle 2
   characters when the length is even. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inp = scanner.nextLine();

        System.out.print(inp.substring(0, inp.length() / 2 - 1 + inp.length() % 2));
        System.out.print(inp.substring(inp.length() / 2 + 1));
    }
}
