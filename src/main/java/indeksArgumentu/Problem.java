package indeksArgumentu;

public class Problem {

    /*
    Write a program that searches for an argument
    equal to "test" (without quotes), and then outputs
    its index in the array args. If it is not found,
    the program must output "-1". This argument can
    occur no more than once.
    */

    public static void main(String[] args) {
        boolean pass = false;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                pass = true;
                System.out.println(i);
            }
        }
        if (pass == false) {
            System.out.println(-1);
        }
    }
}
