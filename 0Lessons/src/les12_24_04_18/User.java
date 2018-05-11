package les12_24_04_18;

/**
 * Created by java on 24.04.2018.
 */

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String name;
    private String lastName;
    private String secondName;
    private String number;
    private String town;
    private String coment;
    private boolean check;
}
