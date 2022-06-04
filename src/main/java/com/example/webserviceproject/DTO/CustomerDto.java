package com.example.webserviceproject.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data

public class CustomerDto {

    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate bornAt;

    public CustomerDto(@NotNull(message = "email  is required.")String email,@NotNull(message = "password  is required.") String password, String firstName, String lastName,LocalDate bornAt ) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornAt=bornAt;
    }
}
