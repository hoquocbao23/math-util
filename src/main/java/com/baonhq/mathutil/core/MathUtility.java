package com.baonhq.mathutil.core;

public class MathUtility {

    // CLASS NÀY SẼ CUNG CẤP CÁC HÀM TIỆN ÍCH CHO MỌI NƠI SỬ DỤNG
    // TIỆN TÍCH CHHO MỌI NƠI DÙNG

    // hàm tính n!
    // <0! và 21! thì ta không tính, 20! vừa đủ kiểu long

    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");

        if (n == 0 || n == 1)
            return 1;

        // tới đâu thì n = 2,3...20
        long result = 1;        // tích ban đầu là 1
        for (int i = 2; i <= n ; i++) {
            result *= i;        // nhân cộng dồn vào kết quả
        }
        return result;
    }
}
