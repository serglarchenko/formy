package CommonMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CommonMethods {
    public static String getCurrentData(String format){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return currentDate.format(formatter);
    }
}
