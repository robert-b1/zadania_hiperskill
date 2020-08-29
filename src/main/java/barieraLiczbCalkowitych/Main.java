package barieraLiczbCalkowitych;

import java.util.Scanner;

public class Main {
   /* Write a program that reads a sequence of integer
   numbers in a loop and adds up all numbers.
   If a new number is equal to 0, the program must
   stop the loop and output the accumulated sum.
   When the sum is equal or exceeded 1000 (the barrier),
   the program should also stop and output the value
   equal to sum – 1000.
   Note, the input can contain extra numbers.
   Just ignore them. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wynik = 0;
        while (true) {
            int liczba = scanner.nextInt();
            wynik += liczba;
            if (liczba == 0) {
                System.out.println(wynik);
                break;
            }
            if (wynik >= 1000) {
                System.out.println(wynik - 1000);
                break;
            }
        }
    }
}
