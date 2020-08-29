package sprawdźCzyPodaneLiczbySaRozne;

import java.util.Scanner;

public class Main {
    /*Write a program that reads three numbers and
    checks that they all are different, i.e. not
    equal to one another.
    The output should be true or false. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean answer = (a != b) && (b != c) && (a != c);
        System.out.println(answer);
    }

}
