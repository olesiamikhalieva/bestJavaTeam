package fileStorage;

import lombok.*;

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
    private String address;
    private int age;
    private String maritalStatus;
    private String numberPhone;

    public Student(int id, String name, String secName, String thirdName) {
        this.id = id;
        this.name = name;
        this.secName = secName;
        this.thirdName = thirdName;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + secName + " " + thirdName + " " + address + " " + age + " " + maritalStatus + " " + numberPhone;
    }
}
