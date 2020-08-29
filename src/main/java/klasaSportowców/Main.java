package klasaSportowców;

import java.util.Scanner;

public class Main {
    /*Suppose there are three boys in a sports class.
    You need to write a program that checks the boys
    are arranged in the ascending or descending
    order by height. The program must read three
    integer numbers h1, h2, h3 and outputs true or
    false. If boys have the same height, they are
    considered as correctly arranged. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1, h2, h3;
        h1 = scanner.nextInt();
        h2 = scanner.nextInt();
        h3 = scanner.nextInt();
        boolean result = (h1 >= h2 && h2 >= h3) || (h1 <= h2 && h2 <= h3);
        System.out.println(result);
    }
}
