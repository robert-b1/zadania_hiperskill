package dobryWypoczynekNaWakacjach;

import java.util.Scanner;

public class Main {
   /* Write a program that will help people who
   are going on vacation. The program should
   calculate the total required sum
   (e.g. $) of money to have a good rest for a given duration.
    There are four parameters which have to be
    considered:
    duration in days
    total food cost per day
    one-way flight cost
    cost of one night in a hotel (the number of
    nights equal duration minus one)
    Read values of these parameters from the
    standard input and then print the result. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberDays, foodCost, flightCost, nightCost, result;
        numberDays = scanner.nextInt();
        foodCost = scanner.nextInt();
        flightCost = scanner.nextInt();
        nightCost = scanner.nextInt();
        result = (numberDays * foodCost) + (flightCost * 2) + (numberDays * nightCost - nightCost);

        System.out.println(result);
    }
}
