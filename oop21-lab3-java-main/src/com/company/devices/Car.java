package com.company.devices;

import com.company.animals.Human;

public class Car extends Device {

    public Double engineSize;
    public String fuelType;
    final static Double MAX_FUEL = 1.0;
    public Double currentFuel = 0.0;


    @Override
    public void turnOn() {
        System.out.println("Car is turned on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price, int whichItem) throws Exception {
        if (seller.getCar(whichItem) == this) {
            if (buyer.cash >= price) {
                buyer.isGarageFull();
                buyer.cash -= price;
                seller.cash += price;
                buyer.setCar(this,0) ;
                seller.setCar(null, whichItem);
                System.out.println("Car has been sold");

            }
            else if(seller.getCar(whichItem) == null){
                throw new Exception("Seller does not have this car in garage!");
            }

            else {
                throw new Exception("Buyer does not have enough money");
            }
        } else {
            throw new Exception("Seller does not own the car");
        }
    }

    public void refuel() {
        currentFuel = MAX_FUEL;
    }
}




