package org.example.PojoClasses.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostEmpResponse {
    String status;
    EmpData data;
    String message;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EmpData {
        int id;
        String employee_name;
        String employee_salary;
        String employee_age;
        String profile_image;
    }



}
