package liczbyPodzielnePrzeSzesc;

import java.util.Scanner;

public class Main {
    /*
    Given the sequence of natural numbers.
    Find the sum of numbers divisible by 6.
    The input is the number of elements in the
    sequence, and then the elements themselves.
    In this sequence, there is always a number
    divisible by 6.
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int[] numbers = new int[number];
        int result = 0;
        for (int i = 0; i < number; i++) {
            numbers[i] = scn.nextInt();
        }
        for (int x : numbers) {
            if (x % 6 == 0) {
                result += x;
            }
        }
        System.out.println(result);
    }
}
