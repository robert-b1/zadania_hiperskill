package profil;

import java.util.Scanner;

public class Main {
   /* Ann put M money in the bank. The bank
   increases Ann's deposit by P percent every year.
   Ann wants to know how many years should pass until
   her deposit in the bank reaches K money.
   Can you help her to answer this question?
   The input contains three integers M,P,K
   It is guaranteed that all numbers are positive
   and K≥M. Output the answer to Ann's question */

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        int lata = 0;
        while (k > m) {
            m += m * (p / 100);
            lata++;
        }
        System.out.println(lata);
    }
}
