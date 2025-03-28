package BTVN_Java_1;

public class Bai9 {
    public static void main(String[] args) {
        // Bài 9. Viết chương trình in ra bảng cửu chương từ 1 đến 10

        for (int i = 1; i <= 10; i++) {
            System.out.println("Bảng cửu chưởng số " + i + " là: ");
            for (int j = 0; j <= 10 ; j++) {
                System.out.println( i + " x " + j + " = " + (i*j) );
            }
        }

    }
}
