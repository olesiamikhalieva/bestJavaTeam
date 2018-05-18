package fileStorage;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Journal {

    private int id;
    ArrayList<String> dates;

}
