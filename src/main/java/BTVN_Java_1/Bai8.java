package BTVN_Java_1;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        // Bài 8. Viết chương trình yêu cầu người dùng nhập vào 1 số N, sau đó tính tổng các số từ 1 đến N

        Scanner sc = new Scanner(System.in);
        System.out.println( " Nhập vào 1 số nguyên n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(" Tổng của các số nguyên đến " + n + " là: " + sum);

    }
}
