package org.kimfri;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DateTrixTest {

    private DateTrix dateTrix;
    @BeforeEach
    void setUp() {
        dateTrix = new DateTrix();
    }

    @Test
    void getEarliestDate() {
        final LocalDate now = LocalDate.now();
        final LocalDate twoDaysAgo = LocalDate.now().minusDays(2);
        final LocalDate fiveWeeksFromNow = LocalDate.now().plusWeeks(5);
        final List<LocalDate> localDates = Arrays.asList(now, twoDaysAgo, fiveWeeksFromNow);

        final LocalDate earliestDate = dateTrix.getEarliestDate(localDates);
        assertEquals(twoDaysAgo, earliestDate);
    }

    @Test
    void getFormattedDate() {
        final LocalDate localDate = LocalDate.of(2022, 3, 18);
        final LocalTime localTime = LocalTime.of(8, 32, 22);
        final LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        final String actual = dateTrix.getFormattedDate(localDateTime);
        final String expected = "2022-03-18T08:32:22";
        assertEquals(expected, actual);
    }
}