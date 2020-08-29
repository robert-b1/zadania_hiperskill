package biurka;

import java.util.Scanner;

public class Main {
    /*A university has decided to open math courses
     and equip classrooms for 3 groups with special
     new desks. The faculty agreed that in the sake
     of productivity only two students may share
     one table. The enrolment has ended, and now
     the task is to count the number of desks to
     order the correct amount from the shop.
     Of course, the university is short of money,
     so you need to calculate the minimum of desks.
     But don't forget that each group will sit in
     its own classroom! */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a, b, c, suma;

        a = scanner.nextInt();

        b = scanner.nextInt();

        c = scanner.nextInt();
        suma = (a / 2 + a % 2) + (b / 2 + b % 2) + (c / 2 + c % 2);
        System.out.println(suma);
    }
}
