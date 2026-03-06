package org.pratcticeOrg.Tests.Helpers.ApiHelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class CurlLoggingFilter implements Filter {

    @Override
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
        StringBuilder curl = new StringBuilder("curl");

        // Method - default is GET, so only add if different or always add for clarity
        curl.append(" -X ").append(requestSpec.getMethod());

        // Url
        curl.append(" '").append(requestSpec.getURI()).append("'");

        // Headers
        requestSpec.getHeaders().forEach(header -> {
            curl.append(" \\\n  -H '").append(header.getName()).append(": ").append(header.getValue()).append("'");
        });

        // Body
        Object body = requestSpec.getBody();
        if (body != null) {
            String bodyString;
            if (body instanceof String) {
                bodyString = (String) body;
            } else {
                try {
                    // Serialize POJO to JSON
                    bodyString = new ObjectMapper().writeValueAsString(body);
                } catch (JsonProcessingException e) {
                    bodyString = body.toString();
                }
            }
            // Basic escaping for single quotes in body
            curl.append(" \\\n  -d '").append(bodyString.replace("'", "'\\''")).append("'");
        }

        System.out.println("\n--- Generated CURL ---");
        System.out.println(curl);
        System.out.println("----------------------\n");

        return ctx.next(requestSpec, responseSpec);
    }
}
