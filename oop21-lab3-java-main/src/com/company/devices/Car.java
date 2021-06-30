package com.company.devices;

import com.company.animals.Human;

import java.util.ArrayList;
import java.util.List;

public class Car extends Device {

    public Double engineSize;
    public String fuelType;
    final static Double MAX_FUEL = 1.0;
    public Double currentFuel = 0.0;

    List<Human> carOwners = new ArrayList<Human>();



    @Override
    public void turnOn() {
        System.out.println("Car is turned on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price, int whichItem) throws Exception {
        boolean flag = false;
        Car[] tempGar = seller.garage;
        for(int i = 0; i<seller.garage.length; i++){
            if(tempGar[i]==seller.getCar(whichItem)){
                System.out.println("The car is in the garage");
                flag = true;
                break;
            }
        }
        if (flag==false){
            throw new Exception("Seller does not have this car in garage!");
        }
        Car[] buyerGarage= buyer.garage;
        int availableSpot=buyerGarage.length;
        boolean wheresTheSpace = false;
        int spaceCounter = 0;
        for(int n=0; n<availableSpot; n++){
            spaceCounter++;
            if(buyerGarage[n]==null){
                wheresTheSpace=true;
                break;
            }
        }
        if(wheresTheSpace==false) {
            System.out.println("There's no space in the Garage");
        }

        if (seller.getCar(whichItem) == this) {
            if (buyer.cash >= seller.getCar(whichItem).getValue()) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.setCar(this,spaceCounter) ;
                seller.setCar(null, whichItem);
                System.out.println("Car has been sold");

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




