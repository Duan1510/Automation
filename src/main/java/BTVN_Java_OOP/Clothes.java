package BTVN_Java_OOP;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Clothes extends Hanghoa{
    public LocalDate dateOfEntry;
    public String brand;
    public static float vat = 0.15f;

    Clothes(String _maHang, String _tenHang){
        super(_maHang,_tenHang);
    }

    @Override
    public String evaluate(){
        if (this.soLuongHangTon > 60 && (ChronoUnit.DAYS.between(dateOfEntry,LocalDate.now()) > 20)){
            return "Hàng bán chậm";
        }
        return "Không có đánh giá gì.";
    }
}
