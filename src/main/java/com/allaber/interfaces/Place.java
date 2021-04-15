package com.allaber.interfaces;

import com.allaber.models.House;

public interface Place {
    String getLocationName();
    boolean test(House house);
}
