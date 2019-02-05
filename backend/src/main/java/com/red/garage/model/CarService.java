package com.red.garage.model;

import com.red.garage.compositeId.CarServiceId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CAR_SERVICE")
public class CarService implements Serializable{

    @EmbeddedId
    private CarServiceId carServiceId;

    @ManyToOne
    @JoinColumn(name = "VIN", insertable = false, updatable = false)
    private Car vin;

    @ManyToOne
    @JoinColumn(name = "SERVICE_ID", insertable = false, updatable = false)
    private Service service;

    @Column(name = "SERVICE_DATE")
    private Date serviceDate;

    public CarServiceId getCarServiceId() {
        return carServiceId;
    }

    public void setCarServiceId(CarServiceId carServiceId) {
        this.carServiceId = carServiceId;
    }

    public Car getVin() {
        return vin;
    }

    public void setVin(Car vin) {
        this.vin = vin;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }
}
