package com.allaber.predicates.type;

import com.allaber.models.House;
import com.allaber.models.Params;
import com.allaber.predicates.AbstractPredicate;
import com.fasterxml.jackson.annotation.JsonProperty;

public class City extends AbstractPredicate {

    @JsonProperty("type")
    String type = "City";

    @JsonProperty("params")
    Params params;

    public City() {
    }

    public City(Params params) {
        this.params = params;
    }

    @Override
    public boolean test(House house) {
        return params.list.contains(house.getCityId());
    }
}