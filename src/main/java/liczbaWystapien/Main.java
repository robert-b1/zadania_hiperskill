package liczbaWystapien;

import java.util.Scanner;

public class Main {

    /*
    Write a program that finds the frequency of occurrences
    of a substring in a given string. Substrings cannot
    overlap: for example, the string ababa contains only
    one substring aba.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str1, i) >= 0) {
                count++;
                i = i + str.indexOf(str1, i);
            }
        }

        System.out.println(count);
    }
}
