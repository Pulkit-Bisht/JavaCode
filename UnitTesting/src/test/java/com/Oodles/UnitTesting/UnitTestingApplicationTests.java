package com.Oodles.UnitTesting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class UnitTestingApplicationTests {
    private  final Calculator c = new Calculator();


    //making new method and check sum method first
    @Test
    void testSum() {
        //actual result

        int actualResult = c.dosum(2, 3, 4);

        //expected result
        int expectedResult = 9;

        //now check actual result is equal to expected result .Now we use assertion

        System.out.println(assertThat(actualResult).isEqualTo(expectedResult));

    }
//Now i am checking my product method for testing

    @Test
    @Disabled
    void testProduct() {

        //Actual Result
        int product = c.doProduct(2, 3);

        //Let expected Result

        int expectedProduct = 7;

        //Now check the result

        assertThat(product).isEqualTo(expectedProduct);
    }

    @Test
    void testCompare() {

        Boolean actualResult=c.compareNumber(1,1);

        assertThat(actualResult).isTrue();
    }


}
