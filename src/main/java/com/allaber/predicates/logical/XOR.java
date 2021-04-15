package com.allaber.predicates.logical;

import com.allaber.models.House;
import com.allaber.predicates.AbstractPredicate;
import com.fasterxml.jackson.annotation.JsonProperty;

public class XOR extends AbstractPredicate {

    @JsonProperty("type")
    String type = "OR";

    @JsonProperty("predicate1")
    AbstractPredicate predicate1;

    @JsonProperty("predicate2")
    AbstractPredicate predicate2;

    public XOR(AbstractPredicate predicate1, AbstractPredicate predicate2) {
        this.predicate1 = predicate1;
        this.predicate2 = predicate2;
    }

    public XOR() {
    }

    @Override
    public boolean test(House house) {
        return predicate1.test(house) ^ predicate2.test(house);
    }
}