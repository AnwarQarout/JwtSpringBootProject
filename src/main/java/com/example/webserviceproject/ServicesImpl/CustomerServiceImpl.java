package com.example.webserviceproject.ServicesImpl;

import com.example.webserviceproject.DTO.CustomerDto;
import com.example.webserviceproject.DTO.SignInDto;
import com.example.webserviceproject.DTO.SignUpDto;
import com.example.webserviceproject.Models.Customer;
import com.example.webserviceproject.Repositories.CustomerRepository;
import com.example.webserviceproject.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
/**
 * This is the Service class for Customers which implements the CustomerService interface and overrides the methods there.
 */
@Service
@Transactional

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Iterable<Customer> getAllStocks() {
        return customerRepository.findAll();
    }



    @Override
    public Customer getStock(long id) {
        return customerRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Customer save(Customer stock) {
        return customerRepository.save(stock);
    }

    @Override
    public Customer update(Long id, CustomerDto customerDto) {
        Optional<Customer> customer = customerRepository.findById(id);

        customer.get().setEmail(customerDto.getEmail());
        customer.get().setFirstName(customerDto.getFirstName());
        customer.get().setLastName(customerDto.getLastName());
        customer.get().setPassword(customerDto.getPassword());
        customer.get().setBornAt(customerDto.getBornAt());



        Customer result = customerRepository.save(customer.get());
        //todo you should use mappers to spperate the DTO and entities usage.
        return result;
    }

    public ResponseEntity<String> singin(@RequestBody SignInDto loginDto){
        if(customerRepository.existsByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword())){
            return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
        }
        else return  new ResponseEntity<>("User not found!.", HttpStatus.OK);

    }

    public ResponseEntity<?> signUp(@RequestBody SignUpDto signUpDto){

        // add check for username exists in a DB
        if(customerRepository.existsByEmail(signUpDto.getEmail())){
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }


        // create user object
        Customer customer = new Customer();
        customer.setFirstName(signUpDto.getFirstName());
        customer.setLastName(signUpDto.getLastName());
        customer.setEmail(signUpDto.getEmail());
        customer.setPassword(signUpDto.getPassword());



        customerRepository.save(customer);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }
}

