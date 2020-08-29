package zaawansowanyKalkulator;

import java.util.Arrays;

public class Problem {
    /*
    Write a program that takes an operator ("MAX", "MIN", "SUM")
    and a sequence of numbers as the command-line arguments
    and then outputs the result of the operator in the standard
    output.
    The description of the operators:
    "MAX" finds the max value of a sequence of numbers;
    "MIN" find the min value of a sequence of numbers
    "SUM" calculates the sum of a sequence of numbers.
    It is guaranteed that a correct operator and at least
    one number will be passed to the program.
    */

    public static void main(String args[]) {
        String operator = args[0];
        int[] array = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            array[i] = Integer.valueOf(args[1 + i]);
        }
        Arrays.sort(array);
        int sum = 0;

        switch (args[0]) {
            case "MAX":
                System.out.println(array[array.length - 1]);
                break;
            case "MIN":
                System.out.println(array[0]);
                break;
            case "SUM":
                for (int x : array) {
                    sum += x;
                }
                System.out.println(sum);
                break;
        }
    }
}
