package odwracanie;

import java.util.Scanner;

public class Main {
    /*Write a program that reads a three-digit
    number, calculates the new number by reversing
    its digits, and outputs a new number. */


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int firstDigit = n / 100;
        final int thirdDigit = n % 10;
        final int secondDigit = (n - firstDigit * 100 - thirdDigit) / 10;
        final int reverseN = thirdDigit * 100 + secondDigit * 10 + firstDigit;

        System.out.println(reverseN);
    }
}