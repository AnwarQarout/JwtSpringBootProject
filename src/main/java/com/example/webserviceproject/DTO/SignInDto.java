package com.example.webserviceproject.DTO;

import lombok.Data;

/***
 * DTO class for Sign In for customers
 * This is  the best practice and makes it more secure to access and add to the repo
 */

@Data
public class SignInDto {

    private String email;
    private String password;

}
