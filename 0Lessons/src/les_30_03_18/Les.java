package les_30_03_18;

import java.io.File;
import java.io.IOException;

/**
 * Created by java on 30.03.2018.
 */
public class Les {
    public static void main(String[] args) throws IOException {
        File file = new File("0Lessons//src//les_30_03_18//Hellow.txt");
        file.createNewFile();
    }
}
