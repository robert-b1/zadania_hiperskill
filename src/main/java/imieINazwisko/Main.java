package imieINazwisko;

import java.util.Scanner;

public class Main {
    /*
    Implement a function for preparing full name.
    The function takes two string arguments: firstName
    and lastName. You need to concat them together with
    a space in the middle.
    If an argument is null then do not add it and a
    space to the full name.
    */

    public static String prepareFullName(String firstName, String lastName) {
        String result;
        String result2;
        if (firstName == null) {
            result = "";
        } else {
            result = firstName + " ";
        }
        if (lastName == null) {
            result2 = "";
        } else {
            result2 = lastName;
        }
        return result + result2;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}
