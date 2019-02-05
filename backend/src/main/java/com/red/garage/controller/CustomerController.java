package com.red.garage.controller;

import com.red.garage.dao.CustomerDao;
import com.red.garage.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    CustomerDao customerDao;

    @Autowired
    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Customer> getCustomerById(@PathVariable("id")BigInteger id){


        return customerDao.findById(id);

    }

   @RequestMapping(path = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getCustomers(){
        return customerDao.findAll();
    }

    @RequestMapping(path = "/name/{name}", method = RequestMethod.GET)
    public List<Customer> getCustomerByName(@PathVariable("name") String name){

        if(name.contains(" ")){
           String[] fullName =  name.split(" ");
           return customerDao.findByFirstNameAndLastName(fullName[0], fullName[1]);

        }else{

            if(!customerDao.findByFirstName(name).isEmpty()){
                return customerDao.findByFirstName(name);
            }else{
                return customerDao.findByLastName(name);
            }

        }

    }



}
