package org.kimfri;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DateTrix {

    String getFormattedDate(LocalDateTime localDateTime) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        return dtf.format(localDateTime);
    }

    LocalDate getEarliestDate(List<LocalDate> dates) {
        return dates.stream()
                .min(LocalDate::compareTo)
                .orElse(LocalDate.of(1, 1, 1));
    }
}
