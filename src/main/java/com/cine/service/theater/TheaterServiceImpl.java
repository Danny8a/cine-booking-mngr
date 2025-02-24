package com.cine.service.theater;

import com.cine.model.Theater;
import com.cine.repository.TheaterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterServiceImpl implements TheaterService {

    private final TheaterRepository theaterRepository;

    @Autowired
    public TheaterServiceImpl(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    @Override
    @Transactional
    public List<Theater> getAllTheaters() {
        return this.theaterRepository.findAll();
    }

    @Override
    @Transactional
    public Theater saveTheater(Theater theater) {
        return this.theaterRepository.save(theater);
    }
}
