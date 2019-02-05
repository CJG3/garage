package com.red.garage.compositeId;

import com.red.garage.model.Car;
import com.red.garage.model.Customer;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigInteger;

@Embeddable
public class CustomerCarId implements Serializable{

    @NotNull
    @Column(name = "CUSTOMER_ID")
    private BigInteger customerId;

    @NotNull
    @Column(name = "VIN")
    private String vin;

    public BigInteger getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigInteger customerId) {
        this.customerId = customerId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
