package com.xworkz.TheaterScreenMngt.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "theater")
public class TheaterDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theaterId;
    private String theaterName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "theater-id")
    private List<ScreenDTO> screens ;

}
