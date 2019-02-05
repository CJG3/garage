package com.red.garage.controller;


import com.red.garage.dao.ServiceDao;
import com.red.garage.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "service")
public class ServiceController {

    ServiceDao serviceDao;

    @Autowired
    public ServiceController(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

    @RequestMapping(path = "/")
    public List<Service> getServices(){
        return serviceDao.findAll();
    }

    @RequestMapping(path = "/{id}")
    public Optional<Service> getService(@PathVariable("id")BigInteger id){
        return serviceDao.findById(id);
    }

}
