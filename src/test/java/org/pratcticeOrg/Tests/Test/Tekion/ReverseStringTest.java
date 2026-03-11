package org.pratcticeOrg.Tests.Test.Tekion;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ReverseStringTest {
    private static final Logger logger = LoggerFactory.getLogger(ReverseStringTest.class);

    @Test
    public void stringReverse()
    {
        String str = "i am raj";
        logger.info(str);
        int left = 0 ;
        StringBuilder builder = new StringBuilder();

        for(int right = str.length()-1 ; right >= 0 ; --right) {
            if( left < str.length())
            {
                if(str.charAt(left) == ' ') {
                    builder.append(' ');
                }
                if(str.charAt(right) !=  ' ')
                    builder.append(str.charAt(right));
                ++left;
                //break;
            }
        }
        logger.info(String.valueOf(builder));

    }

    @Test
    public void findNearestHundredNumber()
    {
        double num = 33100., res;
        double rounded = Math.round(num / 100.0f) * 100;
       // System.out.println(rounded);
        if ((rounded / 100) % 2 != 0)
            logger.info(String.valueOf(rounded));

        double lowerOdd = rounded - 100;
        double upperOdd = rounded + 100;

        res =  (num - lowerOdd <= upperOdd - num) ? lowerOdd : upperOdd;
        logger.info(String.valueOf(res));

        //
    }

    // switch b/w tabs when there are 3 tabs opened
    // Sample test case with @Dataprovider
    // xpath for dynamic element with static element(parent)
    //
}
