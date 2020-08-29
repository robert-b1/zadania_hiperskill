package parametryIIchWartosci;

public class Problem {
    /*
    Write a program that takes command-line arguments
    in the format:
    parameter1 value1 parameter2 value2 ...
    and outputs them in the standard output
    in the format:
    parameter1=value1
    parameter2=value2 ...
    It is guaranteed, that each parameter is followed
    by a value.
    Please, do not rename the provided class Problem.
    */

    public static void main(String args[]) {

        for (int i = 0; i < args.length - 1; i += 2) {
            System.out.println(args[i] + "=" + args[i + 1]);
        }
    }

}
