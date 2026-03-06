package org.pratcticeOrg.Tests.Base;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import groovy.util.logging.Slf4j;
import org.pratcticeOrg.Tests.Test.RestAssured.TestClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;

@Slf4j
public class BaseClass {

    public Logger logger;
    public ObjectMapper mapper;

    @BeforeClass
    public void setup(){
        mapper = new ObjectMapper();
        logger = LoggerFactory.getLogger(TestClass.class);
    }
}
