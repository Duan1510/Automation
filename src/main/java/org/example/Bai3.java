package org.example;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        Bài 3. Viết chương trình khai báo một số thực (định dạng double) và
//        chuyển nó thành số nguyên rồi in ra màn hình
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập vào số thực: ");
        double number =sc.nextDouble();

        int SoNguyen = (int) number;
        System.out.println(" Giá trị của số nguyên sau khi ép kiểu là: " + SoNguyen);

    }
}
