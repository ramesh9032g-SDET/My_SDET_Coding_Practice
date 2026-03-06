package org.pratcticeOrg.Tests.Helpers.ApiHelper;

import io.restassured.response.Response;
import org.example.PojoClasses.Request.CreateEmpRequest;

import static io.restassured.RestAssured.given;
import static org.pratcticeOrg.Tests.Helpers.Common.Constants.*;

public class RestApiHelper {

    public static Response CreateEmpApiCall(CreateEmpRequest createReq)
    {
        return given()
                .filter(new CurlLoggingFilter()) // Added filter here
                //.log().all()
                .baseUri(BASE_URL)
                .headers("contentType" ,"application/json")
                .body(createReq)
                .when()
                .post(POSTURI)
                .then()
                .extract()
                .response();
    }

    public static Response GetEmpDetailsApiCall()
    {
        return given()
                .filter(new CurlLoggingFilter()) // Added filter here
                .baseUri(BASE_URL)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .when()
                .get(GETURI)
                .then()
                .extract()
                .response();
    }

}
