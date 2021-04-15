package com.allaber.predicates.type;

import com.allaber.models.House;
import com.allaber.models.LogicalOperations;
import com.allaber.predicates.AbstractPredicate;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class DatePredicate extends AbstractPredicate {

    @JsonProperty("paramId")
    int paramId;

    @JsonProperty("date")
    Date date;

    @JsonProperty("logicalOpt")
    LogicalOperations logicalOpt;

    public DatePredicate(int paramId, Date date, LogicalOperations logicalOpt) {
        this.paramId = paramId;
        this.date = date;
        this.logicalOpt = logicalOpt;
    }

    public DatePredicate() {
    }

    @Override
    public boolean test(House house) {

        switch (logicalOpt) {
            case EQUALLY:
                if (date.compareTo(house.getHouseCompletionDate()) == 0) {
                    return true;
                } else {
                    return false;
                }
            case MORE:
                return date.toInstant().isAfter(house.getHouseCompletionDate().toInstant());
            case MOREOREQUAL:
                if (date.toInstant().isAfter(house.getHouseCompletionDate().toInstant()) ||
                        date.compareTo(house.getHouseCompletionDate()) == 0) {
                    return true;
                } else {
                    return false;
                }
            case LESS:
                return date.toInstant().isBefore(house.getHouseCompletionDate().toInstant());
            case LESSOREQUAL:
                if (date.toInstant().isBefore(house.getHouseCompletionDate().toInstant()) || date.compareTo(house.getHouseCompletionDate()) == 0) {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }
}