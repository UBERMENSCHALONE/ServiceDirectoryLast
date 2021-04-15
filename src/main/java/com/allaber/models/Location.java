package com.allaber.models;

import com.allaber.interfaces.Place;
import com.allaber.predicates.AbstractPredicate;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location implements Place {

    @JsonProperty("locationName")
    String locationName;

    @JsonProperty("predicate")
    AbstractPredicate predicate;

    public Location(String locationName, AbstractPredicate abstractPredicate) {
        this.locationName = locationName;
        this.predicate = abstractPredicate;
    }

    public Location() {
    }

    @Override
    public String getLocationName() {
        return locationName;
    }

    @Override
    public boolean test(House house) {
        return predicate.test(house);
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public AbstractPredicate getGroup() {
        return predicate;
    }

    public void setGroup(AbstractPredicate group) {
        this.predicate = group;
    }
}
