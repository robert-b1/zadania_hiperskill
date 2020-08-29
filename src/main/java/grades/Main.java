package grades;

import java.util.Scanner;

public class Main {
    /*
    Find the number of D, C, B and A grades for the last
    test on informatics, where n students from a class
    have successfully passed the test.
    In this task, we use a 5-point grading system and
    are interested only in passing grades: from 2 to 5.
    They correspond to the letter grades in the following
    way: 5 is for A, 4 is for B, 3 is for C and 2 is for D.
    The program gets number n as input and then gets the grades
    themselves: one by one.
    The program should output four numbers in a single line:
    the number of D, C, B, and A grades respectively.
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] tabNumbers = new int[n];
        int A = 0, B = 0, C = 0, D = 0;
        for (int i = 0; i < n; i++) {
            int number = scn.nextInt();
            tabNumbers[i] = number;
        }
        for (int x : tabNumbers) {
            if (x == 2) {
                D++;
            }
            if (x == 3) {
                C++;
            }
            if (x == 4) {
                B++;
            }
            if (x == 5) {
                A++;
            }
        }
        System.out.println(D + " " + C + " " + B + " " + A);

    }

}
