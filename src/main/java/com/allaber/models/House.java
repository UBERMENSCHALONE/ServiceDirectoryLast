package com.allaber.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class House {

    @JsonProperty("cityId")
    int cityId;

    @JsonProperty("quarterId")
    int quarterId;

    @JsonProperty("streetId")
    int streetId;

    @JsonProperty("houseId")
    int houseId;

    @JsonProperty("houseCompletionDate")
    Date houseCompletionDate;


    public House(int cityId, int quarterId, int streetId, int houseId, Date houseCompletionDate) {
        this.cityId = cityId;
        this.quarterId = quarterId;
        this.streetId = streetId;
        this.houseId = houseId;
        this.houseCompletionDate = houseCompletionDate;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getQuarterId() {
        return quarterId;
    }

    public void setQuarterId(int quarterId) {
        this.quarterId = quarterId;
    }

    public int getStreetId() {
        return streetId;
    }

    public void setStreetId(int streetId) {
        this.streetId = streetId;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public Date getHouseCompletionDate() {
        return houseCompletionDate;
    }

    public void setHouseCompletionDate(Date houseCompletionDate) {
        this.houseCompletionDate = houseCompletionDate;
    }
}
