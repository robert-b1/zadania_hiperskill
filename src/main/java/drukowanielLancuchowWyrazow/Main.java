package drukowanielLancuchowWyrazow;

import java.util.Scanner;

public class Main {
    /*
    Write a program that reads four words and outputs them
    in the same order, each in a new line.
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();
        String wordFour = scanner.next();

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);
        System.out.println(wordFour);
    }
}
