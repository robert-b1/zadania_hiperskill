package fizzBuzz;

import java.util.Scanner;

public class Main {
   /* Fizz Buzz is a classic programming problem.
   Here is its slightly modified version. Write a
   program that takes the input of two integers:
   the beginning and the end of the interval
   (both numbers belong to the interval).
   The program should output the numbers from this
   interval, but if the number is divisible by 3,
   you should output Fizz instead of it; if the
   number is divisible by 5, output Buzz; and if it
   is divisible both by 3 and by 5, output FizzBuzz.
   Output each number or the word on a separate line
  */

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        for (int i = a; i < b + 1; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else {
                System.out.println(i);
            }
        }
    }
}
