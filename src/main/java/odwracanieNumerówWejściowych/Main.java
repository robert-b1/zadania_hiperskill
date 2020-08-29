package odwracanieNumerówWejściowych;

import java.util.Scanner;

public class Main {
    /*Write a program that reads two integer
    numbers from the standard input and outputs
    them in the reverse order separated by
    one space.*/

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println(num2 + " " + num1);
    }
}
