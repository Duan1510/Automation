package BTVN_Java_1;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        // Bài 11. Viết chương trình nhập vào 1 mảng số nguyên, sau dó tìm phần tử lớn nhất trong mảng đó.

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(" Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            }
        }
        System.out.println(" Phần tử lớn nhất trong mảng là: " + max);
    }
}
