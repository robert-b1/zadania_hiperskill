package interval;

import java.util.Scanner;

public class Main {

    /*
    Given an integer as input. Output True if its value
    is within the interval (−15,12]∪(14,17)∪[19,+∞),
    and False otherwise (case sensitive).
    Here are two types of brackets in the intervals:
    parenthesis () exclude the border number;
    and square brackets [] include the border number.
    */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if ((-15 < number && number <= 12) || (14 < number && number < 17) || (19 <= number)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
