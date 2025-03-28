package BTVN_Java_1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        //Bài 6. Công thức chuyển đổi nhiệt độ C (Celsius) sang nhiệt độ F (Fahrenheit) như sau: 𝐹=𝐶∗ 95
        //Hãy viết chương trình cho phép người dùng nhập nhiệt độ C (Celsius) sau đó chuyển đổi sang
        // nhiệt độ F (Fahrenheit)

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập nhiệt độ theo độ C: ");
        double tempC = sc.nextDouble();
        double tempF = (tempC * 9/5) + 32; // Em tra trên mạng thì công thức này.

        System.out.println(" Nhiệt độ F(Fahrenheit) là: " + tempF);
    }
}
