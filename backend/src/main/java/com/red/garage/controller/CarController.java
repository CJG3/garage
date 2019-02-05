package com.red.garage.controller;

import com.red.garage.compositeId.CarServiceId;
import com.red.garage.dao.CarDao;
import com.red.garage.dao.CarServiceDao;
import com.red.garage.model.Car;
import com.red.garage.model.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "car")
public class CarController {

    CarDao carDao;

    CarServiceDao carServiceDao;

    @Autowired
    public CarController(CarDao carDao, CarServiceDao carServiceDao) {
        this.carDao = carDao;
        this.carServiceDao = carServiceDao;
    }

    @RequestMapping(path = "/vin/{vin}", method = RequestMethod.GET)
    public Optional<Car> getCarByVin(@PathVariable("vin") String vin){
        return carDao.findById(vin);
    }

    @RequestMapping(path = "/year/{year}")
    public List<Car> getCar(@PathVariable("year") Integer year){
        return carDao.findByYear(year);
    }

    @RequestMapping(path = "/make/{make}", method = RequestMethod.GET)
    public List<Car> getCarByMake(@PathVariable("make") String make){
        return carDao.findByMake(make.toUpperCase());
    }

    @RequestMapping(path = "/model/{model}", method = RequestMethod.GET)
    public List<Car> getCarByModel(@PathVariable("model") String model){
        return carDao.findByModel(model.toUpperCase());
    }


    /*
    Car Service Calls
     */

    @RequestMapping(path = "/vin/{vin}/service/", method = RequestMethod.GET)
    public List<CarService> getCarServiceByVin(@PathVariable("vin") String vin){
        return carServiceDao.findBycarServiceIdCarId(vin);
    }

    @RequestMapping(path = "/vin/{vin}/service/{id}", method = RequestMethod.GET)
    public Optional<CarService> getCarServiceByVin(@PathVariable("vin") String vin, @PathVariable("id")BigInteger id){
        CarServiceId csi = new CarServiceId();
        csi.setCarId(vin);
        csi.setServiceId(id);
        return carServiceDao.findById(csi);
    }








}
