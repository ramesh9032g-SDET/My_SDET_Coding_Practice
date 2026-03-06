package org.example.PojoClasses.Request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
    @JsonProperty("count")
    private int count;

    @JsonProperty("name")
    private String name;

    @JsonProperty("country")
    private List<Country> country;

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Country {

        @JsonProperty("id")
        private int id;

        @JsonProperty("probability")
        private double probability;
    }

}
