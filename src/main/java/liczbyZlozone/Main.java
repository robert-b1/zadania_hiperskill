package liczbyZlozone;

import java.util.Scanner;

public class Main {

    /*Write a method that tests the given number is
    composite or not. The composite number is a positive
    integer that has at least one divisor other than
    1 and itself.
    The method should return a value of the boolean type.
*/

    public static boolean isComposite(long number) {
        boolean result = false;
        long sqr = (long) Math.sqrt(number);
        for (long i = 2; i <= sqr; i++) {
            if (number % i == 0) {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }

}
