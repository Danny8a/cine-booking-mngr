package com.cine.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "seats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String seat_row;

    @Column(nullable = false)
    private String seat_column;

    private Boolean available = true;

    @OneToOne
    @JoinColumn(name = "theater_id", nullable = false)
    private Movie movie;
}