package com.example.calendar1.event;

import com.example.calendar1.event.AbstractEvent;

import java.time.ZonedDateTime;

public class NoDisturbance extends AbstractEvent {

    public NoDisturbance(int id, String title, ZonedDateTime startAt,
                            ZonedDateTime endAt) {
        super(id, title, startAt, endAt);
    }

    @Override
    public void print() {

    } //НетНарушений
}
