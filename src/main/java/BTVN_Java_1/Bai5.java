package BTVN_Java_1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Bài 5. Viết chương trình tính diện tích và chu vi hình chữ nhật.

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập chiều dài của hình chữ nhật: ");
        double chieudai = sc.nextDouble();
        System.out.println(" Nhập chiều rộng của hình chữ nhật: ");
        double chieurong = sc.nextDouble();

        double s = chieudai*chieurong; // Diện tích hình chữ nhật
        double p = (chieudai+chieurong) * 2; // Chu vi hình chữ nhật

        System.out.println(" Diện tích của hình chữ nhật là: " + s);
        System.out.println(" Chu vi của hình chữ nhật là: " + p);

    }
}
