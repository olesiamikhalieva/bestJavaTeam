package les9_03_04_18;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Kakchitatcsajta {

    public static void main(String[] args) throws Exception {

        StringBuilder stringBuilder = new StringBuilder();
        String str = new String();
        try (InputStream inputStream = new URL("https://www.marketwatch.com/investing/index/dax?countrycode=dx").openStream();
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            int sym;
            while ((sym = bufferedInputStream.read()) != -1) {
                stringBuilder.append((char)sym);
            }
        }

        str = stringBuilder.toString();
        System.out.println(str.contains("3 Month"));
        String[] strs = str.split("3 Month");
        System.out.println(strs.length);
    }
}