package com.company.animals;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    List<Animal> pets;
    public Phone phone;
    public Car[] garage;


    public Double cash;
    public String[] fingerNames;

    public final int FINGER_COUNT = 10;
    public final int NUMBER_OF_CARS = 1;
    public final static String HUMAN_SPECIE = "homo sapiens";

    private Double salary;



    public Human(Double salary) {
        super(HUMAN_SPECIE);
        this.setSalary(salary);
        fingerNames = new String[FINGER_COUNT];
        garage = new Car[NUMBER_OF_CARS];
    }
    public Human(int sizeOfGarage){
        super(HUMAN_SPECIE);
        this.garage = new Car[sizeOfGarage];

    }

    public Car getCar(int whichCar) {
        return this.garage[whichCar];
    }

    public void setCar(Car car, int whichCar) {
        this.garage[whichCar] = car;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("NOBODY WILL PAY FOR WORKING");
            this.salary = 0.0;
        }
    }

    public void addPet(Animal pet) {
        if(pets == null) {
            pets = new ArrayList<Animal>();
        }
        pets.add(pet);
    }

    public List<Animal> getPets() {
        return pets;
    }

    public void carsValue(){
        double totalValue=0;
        for(int i=0;i<garage.length;i++){
            totalValue +=getCar(i).getValue();

        }
        System.out.println("Total value: "+totalValue);
    }
    public void carsSortedByAge(){
        Car tmp;
        for(int i=0;i< garage.length-1;i++){
            for(int j=0;j< garage.length-i-1;j++)
                if (garage[j].getYearOfProduction() > garage[j + 1].getYearOfProduction()) {
                    tmp = garage[j];
                    garage[j] = garage[j + 1];
                    garage[j + 1] = tmp;

                }

        }

    }
    public void printArray(){
        for(int i=0;i<garage.length;i++){
            System.out.println("Car: "+garage[i].getProducer()+" "+garage[i].getModel()+", Year of production: "+garage[i].getYearOfProduction());
        }
    }


    public void isGarageFull() throws Exception {
        boolean b = false;
        for(int i=0;i< garage.length;i++){
            if(garage[i]==null){
                b=true;
            }
        }
        if(b==false){
            throw new Exception("There is no place in garage left!");
        }


    }
    public void firstAvailableSpot(){
        for(int i=0;i< garage.length;i++){
            if(garage[i]==null){


            }
        }
    }


}
