package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Cars{
    private int carrying;

    public Lorry(String carClass, String carBrand, double weight, Engine motor, Driver driver, int carrying) {
        super(carClass, carBrand, weight, motor, driver);
        this.carrying = carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    @Override
    public String toString() {
        return  getCarBrand() + " "+getCarClass() + " "+getWeight()+" "+getDriver() +" "+ getMotor() +" "  + getCarrying();
    }
}