package com.baonhq.mathutil.main;

import com.baonhq.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactoryGivenRightArgument0ReturnsWell();
        testFactoryGivenRightArgument5ReturnsWell();
    }

    // ta sẽ test hàm ta viết ra, gọi là unit testing
    // ta cần test hàm với các bộ data đưa vào
    // TEST CASE : NHỮNG BỘ DATA ĐƯA VÀO HÀM, APP, VÀ CÁCH THỨC SÀI DATA NÀY VÀ KẾT QUẢ KÌ VỌNG
    // APP SẼ TRẢ VỀ GÌ ĐÓ

    // TEST CASE 02
    //DESCRIPTION: ( MO TẢ MỤC ĐÍCH TEST CASE )
    //              TO CHECK THE getFACTORIAL() method with correct given argument n = 5

    //STEPS/PROCEDURES: (CÁC BƯỚC TEST MÀN/APP)
    //                  CALL getFACTORIAL() WITH ARG getFACTORIAL(5)

    //EXPECTED RESULT: TO HAVE NUMBER 120 AS THE RESULT OF 5!

    //STATUS: TRẠNG THÁI CỦA TESTCASE
    //          PASS, FALL
    //CHỜ XEM APP XỬ LÍ RA ACTUAL VALUE
    // SO SÁNH VỚI EXPECTED VALUE ĐỂ LUẬN ĐÚNG SAI

    static void testFactoryGivenRightArgument5ReturnsWell(){
        System.out.println("5! = \n"
                + "ExpectedResult: 120" + "\n"
                + "ActualResult: " + MathUtility.getFactorial(5));
    }

    // ----------------------------------------------------------------------------
    // TEST CASE 01
    //DESCRIPTION: ( MO TẢ MỤC ĐÍCH TEST CASE )
    //              TO CHECK THE getFACTORIAL() method with correct given argument

    //STEPS/PROCEDURES: (CÁC BƯỚC TEST MÀN/APP)
    //                  CALL getFACTORIAL() WITH ARG getFACTORIAL(0)

    //EXPECTED RESULT: TO HAVE NUMBER 1 AS THE RESULT OF 0!

    //STATUS: TRẠNG THÁI CỦA TESTCASE
    //          PASS, FALL
    //CHỜ XEM APP XỬ LÍ RA ACTUAL VALUE
    // SO SÁNH VỚI EXPECTED VALUE ĐỂ LUẬN ĐÚNG SAI



    // VIẾT CODE TEST ĐỂ TEST HÀM CHIÍNH CHẠY ĐÚNG HAY KHÔNG
    static void testFactoryGivenRightArgument0ReturnsWell(){
        int n = 0;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);

        System.out.println(n + "! = \n"
                            + "ExpectedResult: " + expectedResult + "\n"
                             + "ActualResult: " + actualResult);
    }




}