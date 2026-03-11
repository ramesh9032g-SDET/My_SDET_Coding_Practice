package org.pratcticeOrg.Tests.Test;

import groovy.util.logging.Slf4j;
import io.restassured.response.Response;
import org.example.PojoClasses.Request.CreateObjectsRequest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Slf4j
public class SampleRestAssuredTest {


    @Test
    public void validatePostResponse()
    {
        String baseUrl = "https://api.restful-api.dev", postUri = "/objects";

        CreateObjectsRequest createObjectsRequest = CreateObjectsRequest
                .builder()
                .name("Apple MacBook Pro 16")
                .data(CreateObjectsRequest.ObjectData.builder().CPU_model("Intel Core i9").Hard_disk_size("1 TB").price(1849.99).year(2019).build())
                        .build();

        Response postResponse = given()
                .baseUri(baseUrl)
                .header("Content-Type", "application/json")
                .body(createObjectsRequest)
                .when()
                .post(postUri)
                .then()
                .extract()
                .response();

        System.out.println(postResponse.getBody().asString());




    }

}
