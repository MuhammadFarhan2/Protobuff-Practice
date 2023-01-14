package com.farhan.protobuf;

import com.farhan.models.*;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        Address personAddress1 = Address.newBuilder()
                .setPostbox(1221)
                .setStreet("newpind")
                .setCity("Sukkur")
                .build();

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2021)
                .setBodyStyleEnum(BodyStyle.SEDAN)
                .build();
        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2022)
               .setBodyStyleEnumValue(2)
                .build();

        List<Car> cars = new ArrayList<Car>();
        cars.add(accord);
        cars.add(civic);

        Person personInfo = Person.newBuilder()
                .setName("Muhammad Farhan")
                .setAge(23)
                .addAllCar(cars)
                .setAddress(personAddress1)
                .build();

//        Map practice
        Dealer dealerCarModels = Dealer.newBuilder()
                .putModel(2021, accord)
                .putModel(2022, civic)
                .build();

//        printing personaInfo with Composition among var,address
        System.out.println(personInfo);

//        printing maps value
        System.out.println(dealerCarModels.getModelMap());
//        USING Enum
        System.out.println(dealerCarModels.getModelOrThrow(2021));



    }
}
