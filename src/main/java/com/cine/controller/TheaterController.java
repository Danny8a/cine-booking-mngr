package com.cine.controller;

import com.cine.model.Theater;
import com.cine.service.theater.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TheaterController {
    private final TheaterService theaterService;

    @Autowired
    public TheaterController(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @GetMapping("/theaters")
    public List<Theater> getAllTheaters() {
        return theaterService.getAllTheaters();
    }

    @PostMapping("/theaters")
    public Theater saveTheater(Theater theater) {
        return theaterService.saveTheater(theater);
    }
}
