package szczesliwyBilet;

import java.util.Scanner;

public class Main {
    /*Paul loves to ride public transport and after
    receiving the ticket, he immediately checks whether
    he got the lucky one. A ticket is considered a
    lucky one if the sum of the first three numbers
    in this ticket matches the sum of the last three
    numbers in the same ticket.
    However, Paul does not count well in his head.
    That is why he asks you to write the program,
    which will check the equality of the sums and
    display "Lucky" if the sums match, and "Regular"
    if the sums differ.
    A string of six digits is provided as input to the
    program.
    You need to print out only the word "Lucky" or
    "Regular" with a capital letter (without quotes). */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] tabLicz = (scanner.next().toCharArray());
        int sum1 = 0, sum2 = 0;

        for (int i : tabLicz) {
            int numInt = Character.getNumericValue(i);
            sum1 += numInt;
        }

        for (int x = 0; x < tabLicz.length - 3; x++) {
            char num = tabLicz[x];
            int numInt = Character.getNumericValue(num);
            sum2 += numInt;
        }
        int sub = sum1 - sum2;
        System.out.println(sub == sum2 ? "Lucky" : "Regular");
    }
}
