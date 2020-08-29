package kwadratyLiczbNaturalnych;

import java.util.Scanner;

public class Main {
    /*  Read an integer number N from the input and
        print all the squares of natural numbers:
        less than or equal to N,
        in ascending order.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int z = 1;
        while (z <= n) {
            System.out.println(z);
            i++;
            z = i * i;
        }
    }
}
