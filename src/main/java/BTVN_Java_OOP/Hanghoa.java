package BTVN_Java_OOP;

public abstract class Hanghoa {
    public final String maHang;
    public String tenHang;
    public int soLuongHangTon;
    public int donGia;

    public Hanghoa(String _maHang, String _tenHang) {
        this.maHang = _maHang;
        this.tenHang = _tenHang;
    }


    public abstract String evaluate();

    public String showInfo() {
        System.out.printf("Info Mã hàng là %s, tên sản phẩm là %s\n", this.maHang, this.tenHang);
        return null;
    }
}
