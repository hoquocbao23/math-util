package com.baonhq.mathutil.core.test;

import com.baonhq.mathutil.core.MathUtility;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MathUtilityDDTTest {

    // CLASS NAY CHUA CAC HAM KIEM THU THEO STYLE DDT
    // TA TACH CODE KIEM THU RIENG
    //KHONG GOP CHUNG VOI BO DATA KIEM THU
    // MUC TIEU: DE DOC CODE KIEM THU
    //

    // BO DATA DUA VAO TEST SE DE RIENG O 1 HAM PUBLIC STATIC
    // ham nay tra ve 1 mang cac con so am < 0 hoac n > 20
    // day la nhug con so tra ra Exception
    public static Integer[] initWrongDataSet(){
        return new Integer[] {-1, -2, -3, -52, -100, -54, -99, -15};
    }


    // Test case 1: check if getFactiorial throws IllegalArgumentException
    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactoryGivenWrongArgumentThrowsException(int n){
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(n);});
    }

    // Test case :
    // check getFactorial() with right agrument return well
    public static Object[][] initRightDataSet(){
        return new Object[][] { {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120}};
    }

    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactoryGivenRightArgumentReturnWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }


}