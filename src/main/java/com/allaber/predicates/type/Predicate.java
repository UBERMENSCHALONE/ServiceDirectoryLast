//package com.allaber.predicates.type;
//
//import com.allaber.models.House;
//import com.allaber.models.LogicalOperations;
//import com.allaber.models.Params;
//import com.allaber.predicates.AbstractPredicate;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//public class Predicate extends AbstractPredicate {
//
//    @JsonProperty("type")
//    String type;
//
//    @JsonProperty("params")
//    Params params;
//
//    public Predicate() {
//    }
//
//    public Predicate(String type, Params params) {
//        this.type = type;
//        this.params = params;
//
//        switch (type){
//            case "List":
//                listPredicate();
//                break;
//            case "Date":
//                datePredicate();
//                break;
//        }
//    }
//
//    @Override
//    public boolean test(House house) {
//        return params.list.contains(house.getCityId());
//    }
//
//    private boolean listPredicate(){
//        return params.list.contains(house.getCityId());
//    }
//
//    private boolean datePredicate(){
//        return false;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
