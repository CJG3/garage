package com.red.garage.dao;

import com.red.garage.compositeId.CarServiceId;
import com.red.garage.model.CarService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarServiceDao extends JpaRepository<CarService, CarServiceId> {


    List<CarService> findBycarServiceIdCarId (String vin);


}
