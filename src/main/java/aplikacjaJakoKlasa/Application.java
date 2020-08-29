package aplikacjaJakoKlasa;

public class Application {
    /*
    You are given a class named Application with
    one string field name.
    Implement an instance method run(String[] args)
    that takes an array of strings and returns nothing.
    The method should output the name of the application
    and then all arguments, each on a new line.
    Let's consider the example.
    Suppose name = "SimpleApplication" and
    passing argument is ["arg1", "arg2", "arg3"]
    */

    String name;

    void run(String[] args) {
        System.out.println(name);
        for (String arg: args) {
            System.out.println(arg);
        }
    }

}
