package com.xworkz.StatesCountryMngt.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "country")
public class CountryDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryId;
    private String countryName;
// to generate relation from associated side also.
    @OneToMany(cascade =  CascadeType.ALL, mappedBy = "country")
//    @JoinColumn(name = "country_id")
    private List<StateDTO> states;
}
