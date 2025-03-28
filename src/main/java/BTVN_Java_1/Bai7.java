package BTVN_Java_1;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        //Bài 7. Viết chương trình yêu cầu người dùng nhập một số nguyên,
        // sau đó kiểm tra xem số đã nhập là số chẵn hay số lẻ

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập 1 số nguyên: ");
        int number = sc.nextInt();

        if (number%2 == 0)
        {
            System.out.println(" Đây là số chẵn");
        } else
        {
            System.out.println(" Đây là số lẻ");
        }
    }
}
