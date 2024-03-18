package com.xworkz.MovieActormngt.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "actors")
public class ActorDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "movie_id")
//    private MovieDTO movie;

}
