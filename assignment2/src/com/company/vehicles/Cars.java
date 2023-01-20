package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;
public class Cars{
    private Engine motor;
    private String carClass;
    private String carBrand;
    private double weight;
    private Driver driver;


    public Cars(Engine engine){
        this.motor = engine;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getMotor() {
        return motor;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public Cars(String carClass, String carBrand, double weight, Engine motor, Driver driver){
        this.carClass = carClass;
        this.carBrand = carBrand;
        this.weight = weight;
        this.motor = motor;
        this.driver = driver;
    }
    public void start(){
        System.out.print("Let's go!");
    }
    public void stop(){
        System.out.print("Stop!");
    }
    public void turnLeft(){
        System.out.print("Turn Left");
    }
    public void turnRight(){
        System.out.print("Turn Right");
    }
    public String toString() {
        return  getCarBrand() + getCarClass() + getDriver() + getMotor() + getWeight();
    }

}