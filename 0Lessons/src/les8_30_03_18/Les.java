package les8_30_03_18;

import java.io.*;
import java.net.URL;

/**
 * Created by java on 30.03.2018.
 */
public class Les {
    public static void main(String[] args) throws IOException {

        InputStream url = new URL("https://www.google.com.ua").openStream();

        System.out.println(url.read());
        try(InputStream inputStream = new URL("https://www.google.com.ua").openStream()) {
            int i = -1;
            int spaceCount = 0;
            int slashCount = 0;
            int trCount = 0;

            while ((i = inputStream.read()) != -1) {
                if ((char) i == ' ') {
                    spaceCount++;
                }
                if ((char) i == '/') {
                    slashCount++;
                }
                if ((char) i == '>') {
                    trCount++;
                }
            }
            System.out.println("spaces: " + spaceCount);
            System.out.println("slashes: " + slashCount);
            System.out.println(">: " + trCount);
        }

    }
}
