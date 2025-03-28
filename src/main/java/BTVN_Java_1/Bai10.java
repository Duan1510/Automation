package BTVN_Java_1;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        // Bài 10. Một tuần, người lao động phải làm việc 40 giờ theo giờ quy định của công ty.
        // Trường hợp người lao động làm hơn 40 giờ, thì số giờ làm thêm sẽ được tính với hệ số 1.5.
        // Hãy viết chương trình nhập vào số giờ làm và lương mỗi giờ của nhân viên,
        // sau đó tính tổng lương mà nhân viên đó được nhận.

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập vào số giờ làm việc của nhân viên: ");
        double hours = sc.nextDouble();
        System.out.println(" Nhập vào số lương mỗi giờ: ");
        double salary = sc.nextDouble();
        double totalSalary;

        if (hours > 40) {
            totalSalary = hours * salary * 1.5 ;
            System.out.println( " Tổng lương của nhân viên là: " + totalSalary);
        } else {
            totalSalary = hours * salary ;
            System.out.println( " Tổng lương của nhân viên là: " + totalSalary);
        }
    }
}
