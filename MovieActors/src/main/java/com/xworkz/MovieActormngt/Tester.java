package com.xworkz.MovieActormngt;

import com.xworkz.MovieActormngt.dto.ActorDTO;
import com.xworkz.MovieActormngt.dto.MovieDTO;
import com.xworkz.MovieActormngt.repository.MovieRepository;
import com.xworkz.MovieActormngt.repository.impl.MovieRepositoryImpl;
import com.xworkz.MovieActormngt.service.MovieService;
import com.xworkz.MovieActormngt.service.impl.MovieServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<MovieDTO> movies = new ArrayList<>();

        // Movie 1
        MovieDTO movie1 = new MovieDTO();
        movie1.setTitle("KGF");
        movie1.setActors(new ArrayList<>()); // Initialize the actors list

        ActorDTO actor1_1 = new ActorDTO();
        actor1_1.setName("Yash");
        ActorDTO actor1_2 = new ActorDTO();
        actor1_2.setName("Sheerenidi");

        movie1.getActors().add(actor1_1);
        movie1.getActors().add(actor1_2);

        movies.add(movie1);

        // Movie 2
        MovieDTO movie2 = new MovieDTO();
        movie2.setTitle("Avengers End Game");
        movie2.setActors(new ArrayList<>()); // Initialize the actors list

        ActorDTO actor2_1 = new ActorDTO();
        actor2_1.setName("Iron Man");
        ActorDTO actor2_2 = new ActorDTO();
        actor2_2.setName("Thor");

        movie2.getActors().add(actor2_1);
        movie2.getActors().add(actor2_2);

        movies.add(movie2);

        MovieRepository movieRepository = new MovieRepositoryImpl();
        MovieService movieService = new MovieServiceImpl(movieRepository);

        for (MovieDTO movie : movies) {
            movieService.addMovie(movie);
            System.out.println("Movie and Actors added successfully.");
        }
    }
}
