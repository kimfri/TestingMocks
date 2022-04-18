package org.kimfri;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class DateHandlerTest {

    private AutoCloseable autoCloseable;

    @BeforeAll
    void setupMocks() {
        autoCloseable = openMocks(this);
    }

    @AfterAll
    void releaseMocks() throws Exception {
        autoCloseable.close();
    }

    DateHandler dateHandler;
    @Mock MyClock myClockMock;
    MyClock myClock;
    @BeforeEach
    void setUp() {
        openMocks(this);
        dateHandler = new DateHandler();
        myClock = new MyClock();
    }

    @Test
    void getHour() {
        when(myClockMock.millis()).thenReturn(99L);
        final long hour = dateHandler.getMilliSeconds(myClockMock);
        assertEquals(99, hour);

        System.err.println(dateHandler.getMilliSeconds(myClock));
        System.err.println(System.currentTimeMillis());

        System.err.println("************************************");
        dateHandler.getSomething(myClock);

        System.err.println("**************************************");
        System.err.println(dateHandler.getHourAgain(myClock));
        final Instant fiveSecondsAgo = Instant.now().minusSeconds(5);
        final Instant now = Instant.now();
        System.err.println("fsa: " + fiveSecondsAgo.toEpochMilli());
        System.err.println("now: " + now.toEpochMilli());
    }
}
