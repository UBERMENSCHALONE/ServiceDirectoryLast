package com.allaber;

import com.allaber.jackson.Converter;
import com.allaber.models.House;
import com.allaber.models.Location;
import com.allaber.models.LogicalOperations;
import com.allaber.models.Params;
import com.allaber.predicates.logical.AND;
import com.allaber.predicates.type.City;
import com.allaber.predicates.type.DatePredicate;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class CalculationLocation {
    Set<Location> locations = new LinkedHashSet();
    House house;

    public CalculationLocation(House house) {
        this.house = house;
        initLocations();
    }


    public void initLocations(){



        // Создание локации Уфа
        Set<Integer> listUfa = new LinkedHashSet<>();
        listUfa.add(1);
        listUfa.add(2);
        listUfa.add(3);
        listUfa.add(4);
        Params paramsCityUfa = new Params(listUfa, null, null);
        Location ufa = new Location("Уфа", new AND (new City(paramsCityUfa), new City(paramsCityUfa)));


        // Создание локации Нефтекамск
        Set<Integer> listNeftekamsk = new LinkedHashSet<>();
        listNeftekamsk.add(2);
        Date date = new Date(1614538800);
        Params paramsCityNeftekamsk = new Params(listNeftekamsk, date, "test");
        Location neftekamsk = new Location("Нефтекамск", new AND (new City(paramsCityNeftekamsk),
                new DatePredicate(73 , date, LogicalOperations.LESS)));


        // в JSON и обратно
        String s1 = toJson(ufa);
        Location locationUfa = toJavaObject(s1);
        locationUfa.getLocationName();


        // в JSON и обратно
        String s2 = toJson(neftekamsk);
        Location locationNeftekamsk = toJavaObject(s2);
        locationNeftekamsk.getLocationName();

        locations.add(locationUfa);
        locations.add(locationNeftekamsk);
    }

    public String getLocationName(){
        String locationName = "Локация данного дома не обнаружена";

        for (Location location : locations) {
            if (location.test(house)) {
                return location.getLocationName();
            }
        }
        return locationName;
    }

    private String toJson(Location location) {
        String s = null;
        Converter converter = new Converter();
        try {
             s = converter.toJSON(location);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    private Location toJavaObject(String s) {
        Converter converter = new Converter();
        Location location = null;
        try {
            location = converter.toJavaObject();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return location;
    }

}
















