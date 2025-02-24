package com.cine.service.theater;

import com.cine.model.Theater;

import java.util.List;

public interface TheaterService {
    List<Theater> getAllTheaters();

    Theater saveTheater(Theater theater);
}
