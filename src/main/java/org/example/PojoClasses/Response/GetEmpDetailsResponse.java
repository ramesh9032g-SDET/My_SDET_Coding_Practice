package org.example.PojoClasses.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetEmpDetailsResponse {
    String status;
    List<EmpData> data;
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
