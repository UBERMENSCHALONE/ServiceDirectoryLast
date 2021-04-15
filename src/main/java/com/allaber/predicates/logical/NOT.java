package com.allaber.predicates.logical;

import com.allaber.models.House;
import com.allaber.predicates.AbstractPredicate;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NOT extends AbstractPredicate {

    @JsonProperty("type")
    String type = "NOT";

    @JsonProperty("predicate")
    AbstractPredicate predicate;

    public NOT(AbstractPredicate predicate) {
        this.predicate = predicate;
    }

    public NOT() {
    }

    @Override
    public boolean test(House house) {
        return !predicate.test(house);
    }
}