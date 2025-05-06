package BTVN_Java_OOP;

public class Machine extends Hanghoa{
    public int warranty;
    public int performance;
    public static float vat = 0.15f;

    Machine(String _maHang, String _tenHang) {
        super(_maHang,_tenHang);
    }

    public void setWarranty(int _warranty){
        if (_warranty >=  0 ){
            this.warranty = _warranty;
        }
    }

    public void setPerformance(int _performance){
        if (_performance >= 0){
            this.performance = _performance;
        }
    }

    @Override
    public String evaluate() {
        if (this.soLuongHangTon < 3){
            return "Hàng bán được";
        }
        return "Không có đánh giá gì.";
    }

    @Override
    public String showInfo(){
        return "Machine";
    }
}
