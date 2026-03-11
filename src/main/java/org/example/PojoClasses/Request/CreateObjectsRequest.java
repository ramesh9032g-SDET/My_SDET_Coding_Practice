package org.example.PojoClasses.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateObjectsRequest {

    String name;
    ObjectData data;

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class ObjectData{
        @JsonProperty("year")
        int year;
        @JsonProperty("price")
        Double price;

        @JsonProperty("CPU model")
        String CPU_model;

        @JsonProperty("Hard disk size")
        String Hard_disk_size;
    }
}
