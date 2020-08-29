package parseUrl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*You want to hack a website now. First, get all
    the available parameters that you can find in the
    URL. Then print them in the "key : value" format.
    If a parameter doesn't have value, print "not found".
    If you find the password (parameter pass), you should
    print its value after all parameters once again,
    but with a key password. If a URL does not contain
    parameter pass, do not print anything after the
    listed parameters. However, if pass parameter is
    present, its value cannot be empty.
    Note: the order of parameters should be the same
    as in the URL.
    Advice: Check examples for better understanding
    and carefully learn the structure of the URL. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        String cutHttps = url.substring(30, url.length());
        String[] spl = cutHttps.split("&");
        int counter = 0;
        List<String> parts = new ArrayList<>();
        List<String> spl3 = new ArrayList<>();
        boolean passTrue = false;


        for (String x : spl) {
            if (x.indexOf("=") < x.length() - 1) {
                String[] parts2 = x.split("=");
                for (String u : parts2) {
                    parts.add(u);
                }
            } else {
                String[] parts2 = x.split("=");
                parts.add(parts2[0]);
                parts.add(" ");
            }
            counter++;
        }

        for (int i = 0; i < counter * 2; i = i + 2) {

            if (parts.get(i + 1).length() != 1) {
                System.out.println(parts.get(i) + " : " + parts.get(i + 1));
            } else {
                System.out.println(parts.get(i) + " : " + "not found");
            }
            if (parts.get(i).matches("pass") && parts.get(i + 1).length() != 1) {
                passTrue = true;
            }
        }

        if (passTrue == true) {
            for (int k = 0; k < counter * 2; k++) {
                if (parts.get(k).matches("pass")) {
                    System.out.println("password : " + parts.get(k + 1));
                }
            }
        }
    }
}
