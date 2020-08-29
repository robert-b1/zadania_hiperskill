package parzysteCzyNieparzyste;

import java.util.Scanner;

public class Main {
    /*Given a sequence of natural numbers. For each
    number of the sequence output "even" if the
    number is even, otherwise, "odd". If the number
    is equal to 0, the program must stop reading
    and processing numbers. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else if (i % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
