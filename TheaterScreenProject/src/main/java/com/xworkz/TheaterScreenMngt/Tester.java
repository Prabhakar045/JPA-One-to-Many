package com.xworkz.TheaterScreenMngt;

import com.xworkz.TheaterScreenMngt.dto.ScreenDTO;
import com.xworkz.TheaterScreenMngt.dto.TheaterDTO;
import com.xworkz.TheaterScreenMngt.repository.TheaterRepository;
import com.xworkz.TheaterScreenMngt.repository.impl.TheaterRepositorympl;
import com.xworkz.TheaterScreenMngt.service.TheaterService;
import com.xworkz.TheaterScreenMngt.service.impl.TheaterServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {

        List<TheaterDTO> theaters = new ArrayList<>();

        // Theater 1
        TheaterDTO theater1 = new TheaterDTO();
        theater1.setTheaterName("Veeresh");
        theater1.setScreens(new ArrayList<>()); // Initialize screens list

        ScreenDTO screen1_1 = new ScreenDTO();
        screen1_1.setScreenName("Screen 1");
        ScreenDTO screen1_2 = new ScreenDTO();
        screen1_2.setScreenName("Screen 2");

        theater1.getScreens().add(screen1_1);
        theater1.getScreens().add(screen1_2);

        theaters.add(theater1);

        // Theater 2
        TheaterDTO theater2 = new TheaterDTO();
        theater2.setTheaterName("Prasanna");
        theater2.setScreens(new ArrayList<>()); // Initialize screens list

        ScreenDTO screen2_1 = new ScreenDTO();
        screen2_1.setScreenName("Screen 1");
        ScreenDTO screen2_2 = new ScreenDTO();
        screen2_2.setScreenName("Screen 2");

        theater2.getScreens().add(screen2_1);
        theater2.getScreens().add(screen2_2);

        theaters.add(theater2);

        TheaterRepository theaterRepository = new TheaterRepositorympl();
        TheaterService theaterService = new TheaterServiceImpl(theaterRepository);

        for (TheaterDTO theater : theaters) {
            if (theaterService.validateAndAddTheater(theater)) {
                System.out.println("added successfully.");
            }
        }
    }
}
