package sortowanieLiczb;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Implement a method for sorting a given array of
    integers in the ascending order.
    You can use any algorithm for sorting it.
    */

    public static void sort(int[] numbers) {
        Arrays.sort(numbers);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
