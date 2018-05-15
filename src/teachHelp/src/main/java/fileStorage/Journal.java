import lombok.*;

import java.util.ArrayList;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Journal {

    private int id;
    ArrayList<String> dates ;


}
