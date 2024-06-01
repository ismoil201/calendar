package com.example.calendar1.event;

import com.example.calendar1.event.Event;

import java.time.Duration;
import java.time.ZonedDateTime;

public  abstract class AbstractEvent implements Event {

    private  final int id;
    private String title;

    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
    private Duration duration;

    private  final  ZonedDateTime createdAt;
    private  ZonedDateTime modifiedAt;

    private boolean deleteYn;

    protected  AbstractEvent(int id, String title, ZonedDateTime startAt,
                             ZonedDateTime endAt
                             ){
        this.id = id;
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;
        this.duration = Duration.between(startAt, endAt);

        ZonedDateTime now  = ZonedDateTime.now();
        this.createdAt = now;
        this.modifiedAt =  now;

        this.deleteYn = false;

    }


    public String getTitle(){
        return  title;
    }
}
