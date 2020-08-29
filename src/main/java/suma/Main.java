package suma;

import java.util.Scanner;

public class Main {
    /*Write a program that reads the numbers a, b, c
    and checks if any pair of them sums to 20.
    The program must output true or false.
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean result = a + b == 20 || a + c == 20 || b + c == 20;
        System.out.printf(String.valueOf(result));
    }
}
