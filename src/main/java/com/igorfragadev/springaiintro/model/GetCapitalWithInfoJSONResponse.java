package com.igorfragadev.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public record GetCapitalWithInfoJSONResponse(@JsonPropertyDescription("This is the city name") String capital,
                                             @JsonPropertyDescription("This is the population of the city") String population,
                                             @JsonPropertyDescription("This is the region where the city is located") String region,
                                             @JsonPropertyDescription("This is the language spoken in this city") String language,
                                             @JsonPropertyDescription("This is the currency used in this country") String currency) {
}
