package com.red.garage.dao;

import com.red.garage.compositeId.CustomerCarId;
import com.red.garage.model.CustomerCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerCarDao extends JpaRepository<CustomerCar, CustomerCarId> {
}
