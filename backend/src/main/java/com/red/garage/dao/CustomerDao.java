package com.red.garage.dao;

import com.red.garage.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerDao extends JpaRepository<Customer, BigInteger>{

    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
}
