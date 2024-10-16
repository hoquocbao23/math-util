package com.baonhq.mathutil.core.test;

import com.baonhq.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;


// TEST TDD
class MathUtilityTest {

    //Testcase #5
    @Test
    public void testFactoryThrowException() {
        // Tra ve ngoai le nhu ki vong
        // check ham tra ve co tra ve ngoai le nhu ki vong khong
        // sai nhung nem ra ngoai le dung
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-5);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-4);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-2);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-10);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-15);});



    }


    //Testcase #4
    @Test
    public void testFactoryGivenWrongArgumentThrowException() {
        // Tra ve ngoai le nhu ki vong
        // check ham tra ve co tra ve ngoai le nhu ki vong khong
        // sai nhung nem ra ngoai le dung
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-5);});

    }


    //Testcase #3
    @Test
    public void testFactoryGivenRightArgumentReturnsWell(){
        long expectedValue = 5;
//        long actualValue = MathUtility.getFactorial(1);

        // SO expeected va actual
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
    }


    // Test case #2
    @Test
    public void testFactoryGivenRightArgument1ReturnsWell(){
        long expectedValue = 1;
//        long actualValue = MathUtility.getFactorial(1);

        // SO expeected va actual
        assertEquals(expectedValue, MathUtility.getFactorial(1));
    }

    // Test case #1:
    @Test
    public void testFactoryGivenRightArgument0ReturnsWell(){
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(0);

        // SO expeected va actual
        assertEquals(expectedValue, actualValue);
    }

}