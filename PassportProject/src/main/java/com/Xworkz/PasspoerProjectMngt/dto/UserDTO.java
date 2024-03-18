package com.Xworkz.PasspoerProjectMngt.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "passport_registration")
public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String passportOffice;
    private String givenName;
    private String surname;
    private String dob;
    private String email;
    private String loginId;
    private String password;
    private String hintQuestion;
    private String hintAnswer;
}
