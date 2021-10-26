package Random;

import java.util.*;

public class random {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("--------------");
//        System.out.println("Nhấn 0 để tìm nạn nhân");
//        System.out.println("--------------");
//        int choice = scanner.nextInt();
//        while ( choice == 0) {
//            random();
//            System.out.println("---------------------");
//            System.out.println("Nhấn 0 để tìm nạn nhân tiếp theo");
//            System.out.println("Nhấn 1 để dừng lại");
//            System.out.println("---------------------");
//
//            choice = scanner.nextInt();
//        }
        List<String> list = new ArrayList<>();
        list.add("BTan");
        list.add("Long");
        list.add("Thanh");
        list.add("PTan");
        list.add("Giau");
        list.add("Hoang");
        list.add("Na");
        list.add("Huu");
        list.add("Tien");

        List<String> xao1 = new ArrayList<>();
        Random random = new Random();
        while (list.size() > 0) {
            int ordinal = random.nextInt(list.size());
            String nanNhan = list.get(ordinal);
            xao1.add(nanNhan);
            list.remove(ordinal);
        }

        ArrayList<String> xao2 = new ArrayList<>();
        while (xao1.size() > 0) {
            int ordinal = random.nextInt(xao1.size());
            String nanNhan = xao1.get(ordinal);
            xao2.add(nanNhan);
            xao1.remove(ordinal);
        }

        ArrayList<String> nanNhanList = new ArrayList<>();
        while (xao2.size() > 0) {
            int ordinal = random.nextInt(xao2.size());
            String nanNhan = xao2.get(ordinal);
            nanNhanList.add(nanNhan);
            xao2.remove(ordinal);
        }
        System.out.println("Chương trình in ra ngẫu nhiên\n các bạn chuẩn bị sile và làm bài tập trước:");
        System.out.println("Danh sách các nạn nhân:");
        for (String nanNhan : nanNhanList) {
            System.out.println(nanNhan);
        }

    }


//    public static void random() {
//        Integer[] arr = new Integer[9];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//
//        Collections.shuffle(Arrays.asList(arr));
//        System.out.println(Arrays.toString(arr));
//        switch (ordinal) {
//            case 0:
//                System.out.println("Na");
//                break;
//            case 1:
//                System.out.println("Long");
//                break;
//            case 2:
//                System.out.println("Tiến");
//                break;
//            case 3:
//                System.out.println("Thành");
//                break;
//            case 4:
//                System.out.println("T.Tân");
//                break;
//            case 5:
//                System.out.println("B.Tân");
//                break;
//            case 6:
//                System.out.println("Hoàng");
//                break;
//            case 7:
//                System.out.println("Hữu");
//                break;
//            case 8:
//                System.out.println("Giàu");
//                break;
//        }
//    }
}







