package com.cine.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "schedule_avaible")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScheduleAvaible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int theaterId;

    @Column(nullable = false)
    private String theaterName;

    @Column(nullable = false)
    private int capacity;

    @Column(nullable = false)
    private String movie;

    @Column(nullable = false)
    private int duration;

    @Column(nullable = false)
    private String classification;

    @Column(nullable = false)
    private Date startTime;

    @Column(nullable = false)
    private int theater;

    @Column(nullable = false)
    private int reservedSeats;
}
