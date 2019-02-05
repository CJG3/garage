package com.red.garage.model;

import com.red.garage.compositeId.CustomerCarId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CUSTOMER_CAR")
public class CustomerCar implements Serializable{

    @EmbeddedId
    private CustomerCarId customerCarId;

    @ManyToOne
    @JoinColumn(name = "VIN", insertable = false, updatable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", insertable = false, updatable = false)
    private Customer customer;

    public CustomerCarId getCustomerCarId() {
        return customerCarId;
    }

    public void setCustomerCarId(CustomerCarId customerCarId) {
        this.customerCarId = customerCarId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
