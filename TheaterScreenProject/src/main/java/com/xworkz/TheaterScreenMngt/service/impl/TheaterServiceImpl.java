package com.xworkz.TheaterScreenMngt.service.impl;

import com.xworkz.TheaterScreenMngt.dto.TheaterDTO;
import com.xworkz.TheaterScreenMngt.repository.TheaterRepository;
import com.xworkz.TheaterScreenMngt.service.TheaterService;

public class TheaterServiceImpl implements TheaterService {

    TheaterRepository theaterRepository;

    public TheaterServiceImpl(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    @Override
    public boolean validateAndAddTheater(TheaterDTO theater) {
        if (theater != null) {
            theaterRepository.addTheater(theater);
            return true;
        }
        return false;
    }
}

