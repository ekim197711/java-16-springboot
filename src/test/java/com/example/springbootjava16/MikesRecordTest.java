package com.example.springbootjava16;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MikesRecordTest {
    @Test
    void favouriteFruit() {

        interface FlyAway{
            String flap();
        }

        enum Fruit{
            Orange,
            Apple,
            Pear
        }

        LocalDateTime now = LocalDateTime.now();
        MikesRecord record1 = new MikesRecord(Fruit.Orange.name(), 100, now);
        MikesRecord record2 = new MikesRecord("Orange", 100, now);
        System.out.println("Record 1 is equal to record 2: " + record2.equals(record1));

        System.out.println("This is the tostring repr. for a record: " + record1);
        System.out.println("This is the tostring repr. for a record: " + record2);

        FlyAway flyAway = new FlyAway() {
            @Override
            public String flap() {
                return "Flaapppeti flap flap flap";
            }
        };

        System.out.println(flyAway.flap());
    }
}