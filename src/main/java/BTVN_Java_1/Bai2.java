package BTVN_Java_1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        /**Bài 2. Viết chương trình khai báo 2 số nguyên a và b, sau đó tính tổng, hiệu, tích,
         * thương và chia lấy phần dư
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập giá trị của số nguyên a: ");
        int a = sc.nextInt();
        System.out.println(" Nhập giá trị của số nguyên b: ");
        int b = sc.nextInt();

        int Tong = a + b;
        int Hieu = a - b ;
        int Tich = a*b;

        System.out.println(" Tổng của 2 số là: " + Tong);
        System.out.println(" Hiệu của 2 số là: " + Hieu);
        System.out.println(" Tích của 2 số là: " + Tich);

        if (b == 0)
            System.out.println("Không chia được cho 0");
        else {
            int Thuong = a/b;
            int PhanDu = a%b;
            System.out.println(" Thương là: " + Thuong);
            System.out.println(" Phần dư là: " + PhanDu);
        }
        // Sử dụng toán tử 3 ngôi
//        String thuong = ( b != 0) ? ( " Giá trị của thương 2 số là: " + a/b ) : " Thương: Không chia được cho 0";
//        System.out.println(thuong);
//        String phanDu = ( b != 0) ? ( " Giá trị phần dư 2 số là: " + a%b ) : " Phần dư: Không chia được cho 0";
//        System.out.println(phanDu);

    }
}
