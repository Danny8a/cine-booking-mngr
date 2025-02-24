package com.cine.service.seat;

import com.cine.model.Seat;
import com.cine.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SeatServiceImpl implements SeatService {
    private final SeatRepository seatRepository;

    @Autowired
    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    @Transactional
    public List<Seat> getAllSeats() {
        return this.seatRepository.findAll();
    }

    @Override
    @Transactional
    public Seat saveSeat(Seat seat) {
        return this.seatRepository.save(seat);
    }

    @Override
    @Transactional
    public Seat updateSeat(Long id, String newStatus) {
        Optional<Seat> seatOptional = this.seatRepository.findById(id);
        if (seatOptional.isPresent()) {
            Seat seat = seatOptional.get();
            seat.setAvailable(false);
            return this.seatRepository.save(seat);
        }
        return null;
    }
}
