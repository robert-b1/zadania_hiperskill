package prostyKalkulator;

public class Problem {
    /*
    Write a program that takes an operator ("+", "-", "*")
    and two integers as the command-line arguments and
    then outputs the result of the operator in the standard
    output. If the passed operator is not from the list,
    it must output the string "Unknown operator" without
    quotes.
    Please, do not rename the provided class Problem.
    */

    public static void main(String[] args) {
        String operator = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}
