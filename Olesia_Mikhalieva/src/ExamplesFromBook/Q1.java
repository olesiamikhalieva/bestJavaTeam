package ExamplesFromBook;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Q1 {
    public static void main(String[] args) throws IOException {
        InputStream in = new URL("https://www.google.ru/").openStream();

        try {

            System.out.println(IOUtils.toString(in));

        } finally {

            IOUtils.closeQuietly(in);

        }
    }
}
