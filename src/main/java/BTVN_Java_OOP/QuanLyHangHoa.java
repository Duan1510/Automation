package BTVN_Java_OOP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuanLyHangHoa {
    static List<Hanghoa> listHangHoa = new ArrayList<>();
    public static void printInfo(List<Hanghoa> listHangHoa, int type) {
        switch (type){
            case 1:
                for (Hanghoa hanghoa : listHangHoa) {
                    if (hanghoa.getClass().getSimpleName().equals("Food")){
                        hanghoa.showInfo();
                    }
                }
                break;
            case 2:
                for (Hanghoa hanghoa : listHangHoa) {
                    if (hanghoa.getClass().getSimpleName().equals("Machine")){
                        hanghoa.showInfo();
                    }
                }
                break;
            case 3:
                for (Hanghoa hanghoa : listHangHoa) {
                    if (hanghoa.getClass().getSimpleName().equals("Clothes")){
                        hanghoa.showInfo();
                    }
                }
                break;
        }
    }
    public static  void addHangHoa(Hanghoa hanghoa){
        Set<String> maHangSet = new HashSet<>();
        if (listHangHoa == null){
            listHangHoa = new ArrayList<>();
        }
        for (Hanghoa hanghoa1 : listHangHoa){
            if (hanghoa1 != null && hanghoa1.maHang.equals(hanghoa.maHang)){
                return;
            }
        }
        listHangHoa.add(hanghoa);
    }
    public static void printlist() {
        System.out.println("Danh sách hàng hóa");
        if (listHangHoa.isEmpty()){
            System.out.println("Không có hàng hóa nào");
            return;
        }
        for (Hanghoa hanghoa : listHangHoa){
            System.out.println(hanghoa);
        }
    }

    public static void main(String[] args) {
        Food rice = new Food("F1", "Rice");
        Food apple = new Food("F2", "Apple");
        Food pear = new Food("F1", "Pear");

        Machine tv = new Machine("M1", "Television");
        Machine lamp = new Machine("M2", "Lamp");
        Machine smart = new Machine("M1", "Smartphone");

        Clothes hat = new Clothes("C1", "Hat");
        Clothes skirt = new Clothes("C2", "Skirt");
        Clothes fan = new Clothes("C1", "Fan");

        addHangHoa(rice);
        addHangHoa(apple);
        addHangHoa(pear);
        addHangHoa(tv);
        addHangHoa(lamp);
        addHangHoa(smart);
        addHangHoa(hat);
        addHangHoa(skirt);
        addHangHoa(fan);
        printInfo(listHangHoa, 3);
    }

}
