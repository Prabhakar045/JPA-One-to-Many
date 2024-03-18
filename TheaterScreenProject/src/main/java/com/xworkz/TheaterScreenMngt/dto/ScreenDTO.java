package com.xworkz.TheaterScreenMngt.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "screen")
public class ScreenDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int screenId;
    private String screenName;

//    @ManyToOne
//    @JoinColumn(name = "theater_id")
//    private TheaterDTO theater;


}