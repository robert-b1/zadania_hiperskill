package sumaCyfr;

import java.util.Scanner;

public class Main {
    /*Given a three-digit integer
    (i.e. an integer from 100 to 999).
    Find the sum of its digits.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num, one, two, trhee, result;
        num = scanner.nextInt();
        one = num / 100;//4
        two = (num - ((num / 100) * 100)) / 10;
        trhee = (num - ((num / 100) * 100)) % 10;
        result = one + two + trhee;
        System.out.println(result);
    }
}
