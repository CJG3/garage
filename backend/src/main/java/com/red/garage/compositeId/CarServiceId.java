package com.red.garage.compositeId;

import com.red.garage.model.Car;
import com.red.garage.model.Service;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigInteger;

@Embeddable
public class CarServiceId implements Serializable {

    @NotNull
    @Column(name = "VIN")
    private String carId;

    @NotNull
    @Column(name = "SERVICE_ID")
    private BigInteger serviceId;


    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public BigInteger getServiceId() {
        return serviceId;
    }

    public void setServiceId(BigInteger serviceId) {
        this.serviceId = serviceId;
    }
}
