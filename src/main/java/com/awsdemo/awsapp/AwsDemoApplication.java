package com.awsdemo.awsapp;

import com.awsdemo.awsapp.entity.AwaUserDetails;
import com.awsdemo.awsapp.repository.AwsRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
@Getter
@Setter
@RequiredArgsConstructor
public class AwsDemoApplication  {

    private static AwsRepository awsRepositoryRS;
    @Autowired
    public AwsRepository getAwsRepository(AwsRepository awsRepository){
        this.awsRepositoryRS=awsRepository;
        return awsRepositoryRS;
    }

    public static void main(String[] args) {

        SpringApplication.run(AwsDemoApplication.class, args);
        System.out.println("Application started");
        AwaUserDetails awaUserDetails=new AwaUserDetails(1,"AB","PRIME",123);
        awsRepositoryRS.save(awaUserDetails);
        System.out.println("user saved");

    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to AWS";
    }
}
