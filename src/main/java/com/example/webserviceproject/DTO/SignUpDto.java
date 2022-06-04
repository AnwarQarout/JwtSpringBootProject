package com.example.webserviceproject.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SignUpDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate bornAt;

}
