package algorytmKompresji;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   /* Upon learning that DNA is not a random string,
   freshmen of the Bioinformatics Institute from
   the informatics group suggested using a compression
   algorithm that compresses repeated characters in a string.
   Encoding is performed as follows:
   The string "aaaabbсaa" is converted into "a4b2с1a2",
   that is, the groups of the same characters of
   the input string are replaced by the symbol and
   the number of its repetitions in this string.
   Write a program, which reads the string, encodes
   it by this algorithm and outputs the encoded sequence.
   The encoding must be case sensitive.
   Note, string can contain only a single character. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int oneLetter = word.length();
        List<String> newWord = new ArrayList<>();
        int counter = 1;
        String one;
        String two;
        boolean end = true;

        while (end) {
            if (oneLetter == 1) {
                System.out.println(word + 1);
                break;
            }
            for (int i = 1; i < word.length(); i++) {
                if (oneLetter == i) {
                    System.out.println(word + 1);
                    break;
                }
                one = String.valueOf(word.charAt(i - 1));
                two = String.valueOf(word.charAt(i));
                if (one.equals(two)) {
                    counter++;
                } else {

                    newWord.add(one + counter);
                    one = two;
                    counter = 1;
                }
                if (i + 1 == word.length()) {
                    newWord.add(two + counter);
                    end = false;
                }
            }
        }
        for (String a : newWord) {
            System.out.print(a);
        }
    }
}
