package wydrukujSznurkiWOdwrotnejKolejnosci;

import java.util.Scanner;

public class Main {
    /*Write a program that reads three strings
    and outputs them in the reverse order,
    each in a new line.*/

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
    }
}
