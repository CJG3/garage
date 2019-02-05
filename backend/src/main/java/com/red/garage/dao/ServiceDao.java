package com.red.garage.dao;

import com.red.garage.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ServiceDao extends JpaRepository<Service, BigInteger> {
}
