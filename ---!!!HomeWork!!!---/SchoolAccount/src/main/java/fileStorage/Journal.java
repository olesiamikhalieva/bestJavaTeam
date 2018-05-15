package fileStorage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by java on 15.05.2018.
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Journal {

    private int id;
    ArrayList<String> dates;

}
