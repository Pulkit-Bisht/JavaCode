package com.my_testing.MyTesting.testing;

import com.my_testing.MyTesting.check.MyTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class CheckMyTest {

    MyTest m = new MyTest();

    @Test
    @Disabled
    void check() {

        Boolean testCompareString = m.compareString("Pooja", "poja");

//        assertTrue("fail by msg", compareString);
        //  assertFalse("True",compareString);
//        assertThat(compareString).isTrue();
//        assertThat(compareString).isFalse();
    }

    @Disabled
    @Test
    void checkString() {
        String concatString = m.concatString("Pushkar", " Bisht");

//        assertThat(concatString).isEqualTo("Pushkar Bisht");
        assertEquals("False", "PushkarBisht", concatString);
    }

    @Disabled
    @Test
    void addOne() {

        int[] actualArray = {2, 4};
        int[] expectedArray = {3, 5};
        assertArrayEquals(expectedArray, m.addElement(actualArray));
    }

    @Test()
    @Disabled
//    @Test(timeout =3)
    void testPerformance() {
//        m.performance();
//        assertTimeout(Duration.ofMillis(10),m.performance());
//        m.performance();
        assertTimeout(ofMillis(3), () -> {
            m.performance();
        });
    }

    //    @Test(expected=ArithmeticException.class)
    @Test

    void testException() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                m.exception(0));
//        assertEquals( exception.getMessage());

        }

        @BeforeEach
    public void before(){
        System.out.println("Before Run");
        }

    }






