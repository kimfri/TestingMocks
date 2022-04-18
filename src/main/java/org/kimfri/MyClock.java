package org.kimfri;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class MyClock extends Clock {
    protected MyClock() {
        super();
    }

    @Override
    public ZoneId getZone() {
        return null;
    }

    @Override
    public Clock withZone(ZoneId zone) {
        return null;
    }

    @Override
    public long millis() {
        return super.millis();
    }

    @Override
    public Instant instant() {
        return Instant.now();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public LocalDateTime getLocalDateTime() {
        return LocalDateTime.ofInstant(instant(), ZoneId.systemDefault());
    }
}
