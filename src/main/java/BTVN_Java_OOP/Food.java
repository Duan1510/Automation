package BTVN_Java_OOP;

import java.time.LocalDate;


public class Food extends Hanghoa {
    public LocalDate startDate;
    public LocalDate expiredDate;
    public String brand;
    public static float vat = 0.08f;

    Food(String _maHang, String _tenHang){
        super(_maHang, _tenHang);
    }

    public void setExpiredDate (LocalDate _expiredDate){
        if (startDate == null) {
            startDate = LocalDate.now();
        }
        if (startDate.isBefore(_expiredDate)){
            expiredDate = _expiredDate;
        }
    }
    @Override
    public String evaluate() {
            if (this.soLuongHangTon > 0 && expiredDate.isBefore(LocalDate.now())) {
                return "Hàng khó bán";
            }
            return "Không có đánh giá gì";
    }

    @Override
    public String showInfo() {
        return "Food";
    }
}
