package org.example.PojoClasses.Request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateEmpRequest {
    @JsonProperty("employee_name")
    String employeeName;

    @JsonProperty("employee_salary")
    String employeeSalary;

    @JsonProperty("employee_age")
    String employeeAge;

    @JsonProperty("profile_image")
    String profileImage;
}
