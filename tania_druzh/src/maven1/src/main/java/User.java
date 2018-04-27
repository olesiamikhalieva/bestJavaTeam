import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by java on 24.04.2018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    private String name;
    private int age;
    private int countPeacesOfShit;
    private boolean lol;
    private String string;

}
