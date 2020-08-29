package konwertujNaBajty;

import java.io.InputStream;

public class Main {

    /*
    Read an input text from the console and print it
    as a sequence of bytes.
    Use System.in as input stream directly.
    Avoid using Scanner.
    */

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] result = inputStream.readAllBytes();
        for (byte x : result) {
            System.out.print(x);
        }
    }
}
