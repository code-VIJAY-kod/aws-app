package com.awsdemo.awsapp.controller;

import com.awsdemo.awsapp.entity.AwaUserDetails;
import com.awsdemo.awsapp.repository.AwsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/aws")
public class BankController {
    @Autowired
    private AwsRepository awsRepository;

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable int id) {
        Optional<AwaUserDetails> userDetails = awsRepository.findById(id);
        if (userDetails.isPresent()) {
            System.out.println("user fetched");
            return new ResponseEntity<>(userDetails.get(), HttpStatus.OK);
        }
        System.out.println("user not found");
        return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
    }
}
