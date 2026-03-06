package org.pratcticeOrg.Tests.Helpers.Common;

import org.apache.commons.lang3.RandomStringUtils;
import org.example.PojoClasses.Request.CreateEmpRequest;

public class RequestBuilderHelper {

    public static CreateEmpRequest createReqBuilder()
    {
        return CreateEmpRequest.builder()
                .employeeName(RandomStringUtils.randomAlphanumeric(5))
                .employeeAge(RandomStringUtils.randomNumeric(2))
                .employeeSalary(RandomStringUtils.randomNumeric(5))
                .profileImage("")
                .build();
    }
}
