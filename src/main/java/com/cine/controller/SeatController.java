package com.cine.controller;

import com.cine.model.Seat;
import com.cine.service.seat.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SeatController {
    private final SeatService seatService;

    @Autowired
    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @GetMapping("/seats")
    public List<Seat> getAllSeats() {
        return seatService.getAllSeats();
    }

    @PostMapping("/seats")
    public Seat saveSeat(Seat seat) {
        return seatService.saveSeat(seat);
    }

    /*
    @PostMapping("/seats/{id}")
    public Seat updateSeat(Long id, String newStatus) {
        return seatService.updateSeat(id, newStatus);
    }

     */
}
