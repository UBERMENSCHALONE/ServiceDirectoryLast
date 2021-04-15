package com.allaber.predicates;

import com.allaber.models.House;
import com.allaber.models.Location;
import com.allaber.models.Params;
import com.allaber.predicates.logical.AND;
import com.allaber.predicates.logical.NOT;
import com.allaber.predicates.logical.OR;
import com.allaber.predicates.logical.XOR;
import com.allaber.predicates.type.City;
import com.allaber.predicates.type.DatePredicate;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.function.Predicate;

@JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = House.class, name = "house"),
        @JsonSubTypes.Type(value = Location.class, name = "location"),
        @JsonSubTypes.Type(value = Params.class, name = "params"),

        @JsonSubTypes.Type(value = City.class, name = "city"),

        @JsonSubTypes.Type(value = AND.class, name = "and"),
        @JsonSubTypes.Type(value = NOT.class, name = "not"),
        @JsonSubTypes.Type(value = OR.class, name = "or"),
        @JsonSubTypes.Type(value = XOR.class, name = "xor"),


        @JsonSubTypes.Type(value = DatePredicate.class, name = "datePredicate"),

})
public abstract class AbstractPredicate implements Predicate<House>{
//    public String type;
//    public Params params;

    @Override
    public boolean test(House house) {
        return true;
    }

}
