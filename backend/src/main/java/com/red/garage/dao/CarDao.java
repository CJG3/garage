package com.red.garage.dao;

import com.red.garage.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarDao extends JpaRepository<Car, String> {

    List<Car> findByYear(Integer year);

    List<Car> findByMake(String make);

    List<Car> findByModel(String make);

}
