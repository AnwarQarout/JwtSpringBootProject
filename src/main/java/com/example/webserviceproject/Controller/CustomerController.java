package com.example.webserviceproject.Controller;

import com.example.webserviceproject.DTO.SignInDto;
import com.example.webserviceproject.DTO.SignUpDto;
import com.example.webserviceproject.Repositories.CustomerRepository;
import com.example.webserviceproject.ServicesImpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @PostMapping("/signUp")
    public void signUp(@RequestBody SignUpDto signUpDto) {
        customerServiceImpl.signUp(signUpDto);

    }

    @GetMapping("/signIn")
    public ResponseEntity<String> signIn(@RequestBody SignInDto signInDto) {
        return customerServiceImpl.singin(signInDto);
    }
}
