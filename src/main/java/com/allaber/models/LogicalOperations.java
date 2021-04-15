package com.allaber.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LogicalOperations {
    @JsonProperty("EQUALLY")
    EQUALLY,
    @JsonProperty("MORE")
    MORE,
    @JsonProperty("MOREOREQUAL")
    MOREOREQUAL,
    @JsonProperty("LESS")
    LESS,
    @JsonProperty("LESSOREQUAL")
    LESSOREQUAL,

    @JsonProperty("LIST")
    LIST,
}
