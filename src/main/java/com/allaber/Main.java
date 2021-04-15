package com.allaber;

import com.allaber.models.House;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        // Создания дома
        House house = new House(2, 3, 1, 1, new Date(1618390556));


        System.out.println(blackBox(house));

    }

    public static String blackBox(House house) {
        CalculationLocation calculationLocation = new CalculationLocation(house);
        return calculationLocation.getLocationName();
    }
}
