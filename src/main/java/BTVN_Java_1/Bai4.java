package BTVN_Java_1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        Bài 4. Viết chương trình cho phép người dùng nhập vào thông tin Họ và tên,
//        Ngày tháng năm sinh, sau đó in ra màn hình
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập Họ và Tên của bạn: ");
        String HoTen = sc.nextLine();
        System.out.println(" Nhập ngày tháng năm sinh của bạn: ");
        String datofbirth = sc.nextLine();

        System.out.println(" Thông tin của bạn là: ");
        System.out.println( " Họ và Tên: " + HoTen);
        System.out.println(" Ngày, tháng, năm: " + datofbirth);
    }
}
