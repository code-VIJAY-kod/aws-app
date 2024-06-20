package com.awsdemo.awsapp.repository;

import com.awsdemo.awsapp.entity.AwaUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface AwsRepository extends JpaRepository<AwaUserDetails,Integer> {
}
