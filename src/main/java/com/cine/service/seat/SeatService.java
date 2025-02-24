package com.cine.service.seat;

import com.cine.model.Schedule;
import com.cine.model.Seat;

import java.util.List;

public interface SeatService {
    List<Seat> getAllSeats();
    Seat saveSeat(Seat seat);
    Seat updateSeat(Long id, String newStatus);
}
