package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Cars{
    private int speed;
    public SportCar(String carClass, String carBrand, double weight, Engine motor, Driver driver, int speed) {
        super(carClass, carBrand, weight, motor, driver);
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    public String toString() {
        return  getCarBrand() +" "+ getCarClass() + " "+ getWeight()+" "+getDriver() + " "+getMotor()  +" "+ getSpeed();
    }
}