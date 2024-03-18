package com.xworkz.StatesCountryMngt.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "state")
@NamedQuery(name = "getCountryOnfoByStateId", query = "select c from CountryDTO c JOIN c.states s where s.stateId = :stateId")

public class StateDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stateId")
    private int stateId;

    private String stateName;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountryDTO country;
}
