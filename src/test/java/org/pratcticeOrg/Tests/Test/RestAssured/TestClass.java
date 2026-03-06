package org.pratcticeOrg.Tests.Test.RestAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import groovy.util.logging.Slf4j;
import io.restassured.response.Response;
import org.pratcticeOrg.Tests.Base.BaseClass;
import org.pratcticeOrg.Tests.Helpers.ApiHelper.RestApiHelper;
import org.pratcticeOrg.Tests.Helpers.Common.RequestBuilderHelper;
import org.example.PojoClasses.Request.CreateEmpRequest;
import org.example.PojoClasses.Response.PostEmpResponse;
import org.example.PojoClasses.Response.GetEmpDetailsResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class TestClass extends BaseClass {

    //Given a  String "a5b1c3d6e2"
    //Print the output "aaaaabcccddddddee"


    @Test
    public void charCount() {
        String str = "a5b1c3d6e2";
        StringBuilder builder = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length() - 1  ; i = i+2)
        {
            map.put(str.charAt(i), Character.getNumericValue(str.charAt(i+1)) );
        }

        System.out.println(map);

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            char ch = entry.getKey();
            for (int j = 0 ; j < entry.getValue() ; j++) {
                builder.append(ch);
            }
        }

        System.out.println(builder.toString());
    }

    @Test
    public void getApiRequest() throws JsonProcessingException {
        logger.info("\n\n*********** Create Emp Details with POST call **************");
        CreateEmpRequest createReq = RequestBuilderHelper.createReqBuilder();
        Response createResponse = RestApiHelper.CreateEmpApiCall(createReq);

        logger.info("Create Request Body : {}\nCreate Response : {}", mapper.writeValueAsString(createReq), createResponse.asPrettyString());

        PostEmpResponse createEmpResponse = createResponse.as(PostEmpResponse.class);
        Assert.assertEquals(createResponse.getStatusCode(), 200,"Create API response code mismatch");
        int id = createEmpResponse.getData().getId();

        logger.info("\n\n*********** Validate Emp Details with GET call ************");
         Response getResponse = RestApiHelper.GetEmpDetailsApiCall();
            // System.out.println(getResponse.asPrettyString());
        GetEmpDetailsResponse empDetailsResponse = getResponse.as(GetEmpDetailsResponse.class);
        Assert.assertEquals(getResponse.getStatusCode(), 200,"Get API response code mismatch");
        GetEmpDetailsResponse.EmpData empData = empDetailsResponse.getData().stream().filter(data -> data.getId() == id ).findFirst().orElseThrow();
        logger.info("Emp name for EmpId {} is : {}", empData.getId(), empData.getEmployee_name());

        //empDetailsResponse.getData().forEach(System.out::println);
    }



}
//

// 1. Send a get request to "https://dummy.restapiexample.com/api/v1/employees" endpoint
//2. Fetch the employee name whose id is 2
// {
//   status
//   data [
//     id
//     employee_name
//     employee_salary
//     employee_age
//     profile_image
//   ]
// }
