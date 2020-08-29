package swistakiNaImprezie;

import java.util.Scanner;

public class Main {
    /*Groundhogs like to throw fun parties, and at
    their parties, they like to eat Reese's peanut
    butter cups. But not too many of them, or they
    feel sick! A successful groundhog party will
    have between 10 and 20 Reese's peanut butter
    cups, inclusive unless it is the weekend,
    in which case they will need 15 to 25 Reese's
    peanut butter cups, inclusive.
    Write a Java program that reads two values:
    the first is the number of Reese's
    peanut butter cups;
    the second is a boolean representing whether it
    is the weekend.
    The program must print the boolean value that
    indicates the party is successful or not. */

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // put your code here
        final int a = scanner.nextInt();
        final boolean day = scanner.nextBoolean();
        final boolean result = (10 <= a && a <= 20) && !day;
        final boolean result2 = (15 <= a && a <= 25) && day;
        System.out.println(result || result2);
    }
}
