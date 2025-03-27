package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Bài 1: Khai báo biến
        int number = 1994;
        char character = 'D';
        String chuoikytu = "Pham, Duan";
        boolean value = true;

        System.out.println(" Giá trị số nguyên là: " + number);
        System.out.println(" Giá trị ký tự chữ là: " + character);
        System.out.println(" Giá trị chuỗi ký tự là: " + chuoikytu);
        System.out.println(" Giá trị logic là: " + value);

        //Bài 2: Tính toán
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập giá trị của số nguyên a: ");
        int a = sc.nextInt();
        System.out.println(" Nhập giá trị của số nguyên b: ");
        int b = sc.nextInt();

        System.out.println(" Tổng của 2 số là: " + (a + b));
        System.out.println(" Hiệu của 2 số là: " + (a - b));
        System.out.println(" Tích của 2 số là: " + (a * b));
        System.out.println(" Thương của 2 số là: " + (a/b));
        System.out.println(" Chia lấy phần dư của 2 số là: " + a%b);



    }
}