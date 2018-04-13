package lesStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class RunnerStream {
    public static void main(String[] args) throws IOException {

        InputStream in =new URL("https://www.marketwatch.com/investing/stock/amzn").openStream();
        String s = "";
        try {
            InputStreamReader inR = new InputStreamReader(in);
            BufferedReader buf = new BufferedReader(inR);
            String line;
            while ((line = buf.readLine()) != null) {
                s += line;
                System.out.println(line);
            }
        } finally {
            in.close();
        }

        System.out.println(s);
    }

}
