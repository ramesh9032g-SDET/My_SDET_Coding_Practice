Feature: Add address Location to the person

  Background:


  Scenario Outline: validate add address to person
    * def PostUrl = "https://rahulshettyacademy.com/maps/api/place/add/json";
    * config PostHeaders = {"Content-Type": "text/plain"};
    * def queryParam = {"key" :  "qaclick123"};

    * def payload = read ("classpath:sre/resources/data/AddAddress.json");
    * def ExpectedRes = read ("classpath:sre/resources/data/ExpAddAddressRes.json");

    Given url PostUrl
    And headers  PostHeaders
    And query queryParam
    And request payload
    When method post
    Then status 201
    Then match response == ExpectedRes



    Examples:
    |read('classpath:src/resources/data/post/AddAddress.csv')|