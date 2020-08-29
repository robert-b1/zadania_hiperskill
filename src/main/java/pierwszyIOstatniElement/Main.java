package pierwszyIOstatniElement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
   /*
   Write a method named getFirstAndLast. The method
   should take an array of ints and return a new
   array of ints. The returned array must contain
   two elements: the first and the last elements of
   the input array.
   It's guaranteed, the input array always has at
   least one element.
   */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }

    private static int[] getFirstAndLast(int[] array) {
        int[] result = new int[2];
        result[0] = array[0];
        result[1] = array[array.length - 1];
        return result;
    }

}
