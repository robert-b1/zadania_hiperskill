package wycieczkaAutokarowa;

import java.util.Scanner;

public class Main {
    /*A bus tour of Europe has been very successful.
    Due to an increase in the number of people that
    want to go on a tour, the tour company decided
    to increase the height of the bus. The new height
    of the bus is exactly N centimeters.
    But the tour’s route runs under a lot of bridges,
    and there is a chance that the bus will crash into
    one of these bridges. Can you find out if this
    will happen?
    The first line of the input contains the height of
    the bus and the number of bridges under which the
    bus passes. The second line contains the heights
    of these bridges.
    You should output "Will not crash" if everything
    will be all right; otherwise, output "Will crash
    on bridge i" (where i is a number of a bridge)
    into which the bus will crash. If the height
    of a bridge equals the height of the bus,
    the bus will crash. */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wysAutobusu = scanner.nextInt();
        int liczbaMostow = scanner.nextInt();
        boolean udanaWyc = true;
        int i;
        for (i = 1; i < liczbaMostow + 1; i++) {
            int wysokoscMostu = scanner.nextInt();
            if (wysAutobusu >= wysokoscMostu) {
                udanaWyc = false;
                break;
            }
        }
        if (udanaWyc == false) {
            System.out.println("Will crash on bridge " + i);
        } else {
            System.out.println("Will not crash");
        }
    }
}
