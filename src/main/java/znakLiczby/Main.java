package znakLiczby;

import java.util.Scanner;

public class Main {
    /*Write a method with the name sign that takes
    an int number and checks whether the number is
    negative, positive or zero. The method should
    return -1, +1 or 0 respectively.
*/

    private static int n;

    public static int sign(int number) {
        if (number == 0) {
            n = 0;
        } else if (number < 0) {
            n = -1;
        } else {
            n = 1;
        }
        return n;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }

}
