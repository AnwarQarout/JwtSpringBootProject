package com.example.webserviceproject.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

/***
 * DTO class for Sign Up for Customers
 * This is  the best practice and makes it more secure to access and add to the repo
 */

@Data
public class SignUpDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate bornAt;

}
