package com.company;

import com.company.animals.*;
import com.company.devices.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Car fiat = new Car();
        fiat.engineSize = 1.9;
        fiat.fuelType = "Diesel";
        fiat.setProducer("Fiat");
        fiat.setModel("Bravo");
        fiat.setValue(4000.00);
        fiat.setYearOfProduction(1999);

        Car hyundai = new Car();
        hyundai.engineSize = 1.9;
        hyundai.fuelType = "Diesel";
        hyundai.setProducer("Hyundai");
        hyundai.setModel("Tucson");
        hyundai.setValue(1000.00);
        hyundai.setYearOfProduction(1989);

        Car ford = new Car();
        ford.engineSize = 1.9;
        ford.fuelType = "Diesel";
        ford.setProducer("Ford");
        ford.setModel("Mustang");
        ford.setValue(1000.00);
        ford.setYearOfProduction(1979);

        Human me = new Human(3);
        me.firstName = "Jan";
        me.lastName = "Kowalski";
        me.setCar(fiat,0);
        me.setCar(hyundai,1);
        me.setCar(ford,2);
        me.cash = 2000.0;

        Human buyer = new Human(2);
        buyer.firstName = "Ignacy";
        buyer.lastName = "Bezglacy";
        buyer.cash = 20000.0;


        me.carsValue();
        me.carsSortedByAge();
        me.printArray();

        ford.sell(me,buyer,10.0,2);
        fiat.sell(me,buyer,10.0,0);


        Animal dog = new Animal("dog");
        dog.name = "Szarik";
        Animal cat = new Animal("cat");
        cat.name = "Puszek";






       /* me.addPet(dog);
        me.addPet(cat);
        List<Animal> pets = me.getPets();
        for (Animal pet : pets) {
            System.out.println(pet.name);*/


        }
    }


      /*  for(int i=0;i<pets.size();i++) {
            System.out.println(String.format("Pet number %d is named %s and weights %.2f", i, pets.get(i).name, pets.get(i).getWeight()));
        }

        List<Animal> sortedAnimalsFirstApproach = pets.stream().sorted(Comparator.comparing(Animal::getWeight)).toList();
        for (Animal pet: sortedAnimalsFirstApproach) {
            System.out.println(String.format("Pet named %s weights %.2f", pet.name, pet.getWeight()));
        }
        List<Animal> sortedAnimalsSecondApproach = pets.stream().sorted(new AnimalWeightComparator()).toList();
        for (Animal pet: sortedAnimalsSecondApproach) {
            System.out.println(String.format("Pet named %s weights %.2f", pet.name, pet.getWeight()));
        }

        me.fingerNames[0] = "Left pinkie";
        me.fingerNames[1] = "Left ring";
        me.fingerNames[2] = "Left middle";
        me.fingerNames[3] = "Left index";
        me.fingerNames[4] = "Left thumb";

        me.fingerNames[5] = "Right thumb";
        me.fingerNames[6] = "Right index";
        me.fingerNames[7] = "Right middle";
        me.fingerNames[8] = "Right ring";
        me.fingerNames[9] = "Right pinkie";

        System.out.println(String.format("I have %d fingers", me.fingerNames.length));

        for (String fingerName: me.fingerNames) {
            System.out.println(fingerName);
        }

        List<String> sortedFingerNames = Arrays.stream(me.fingerNames).sorted().toList();

        for (String fingerName: sortedFingerNames) {
            System.out.println(fingerName);
        }




        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                "Android");

        Phone iPhone6 = new Phone("Apple", "6s", 5.0, "iOS");

        System.out.println("phone: " + onePlus);
        System.out.println("phone: " + iPhone6);
        System.out.println("human: " + me);


        onePlus.turnOn();

        Car fiat = new Car();
        fiat.engineSize = 1.9;
        fiat.fuelType = "Diesel";
        fiat.setProducer("Fiat");
        fiat.setModel("Bravo");

        System.out.println(iPhone6.getModel());
        System.out.println(iPhone6.getProducer());
        System.out.println(iPhone6.os);
        System.out.println(iPhone6.screenSize);


        fiat.turnOn();
        iPhone6.turnOn();
    }
}
*/