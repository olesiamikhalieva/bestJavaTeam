package fileStorage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by java on 11.05.2018.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private String secName;
    private String thirdName;

    public Student(String name, String secName, String thirdName){
        this.name = name;
        this.secName = secName;
        this.thirdName = thirdName;
    }
}
