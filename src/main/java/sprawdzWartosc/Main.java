package sprawdzWartosc;

import java.util.Scanner;

public class Main {
    /*Write a program that reads an integer value and
    checks if it is less than 10 and greater than 0.
    Your program should print a boolean value
    (true or false). */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        boolean b = a < 10 && a > 0;
        System.out.println(b);
    }
}
