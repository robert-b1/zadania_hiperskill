package stworzEuforyczneSlowo;

import java.util.Scanner;

public class Main {
   /* All the letters of the English alphabet are
   divided into vowels and consonants.
   The vowels are: a, e, i, o, u, y.
   The remaining letters are consonants.
   A word is considered euphonious (pleasant-sounding)
   if it has not three or more vowels or consonants
   in a row. Otherwise, it is considered discordant
   (harsh-sounding).
   Your task is to create euphonious words from discordant.
   You can insert any letters inside the word.
   You should output the minimum number of characters
   needed to create a euphonious word from a given word.
   For example, the word "schedule" is considered
   discordant because it has three consonants "sch"
   in a row. To create a euphonious word you need
   to add any vowel between 's' and 'c' or between
   'c' and 'h'. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        String vowels = "aeiouy";

        int counterVowels = 0;
        int counterConsonants = 0;

        int result = 0;

        for (char ch : word.toCharArray()) {
            if (vowels.contains(Character.toString(ch))) {
                counterVowels++;
                counterConsonants = 0;
            } else {
                counterConsonants++;
                counterVowels = 0;
            }

            if (counterConsonants == 3) {
                result++;
                counterConsonants = 1;
            }

            if (counterVowels == 3) {
                result++;
                counterVowels = 1;
            }
        }

        System.out.println(result);

    }
}
