package add_arrays;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int  atIndex, value ,number;
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[10];
        System.out.println("nhập các phần tử cho mảng :");
        for (int i = 0; i < 5; i++) {
            System.out.print("nhập phần tử thứ" + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Trước khi chèn : ");
        for (int element : arr) {
            System.out.print(element + "\t");
        }
//        dịch chuyển các phẩn tử trong mảng sang phải 1 chỉ số
        System.out.print("nhập vị trí cần chèn : ");
        atIndex = scanner.nextInt();
        System.out.print(" Nhập giá trị cần chèn : ");
        value = scanner.nextInt();
        for (int i = 5; i > atIndex; i--) {
            arr[i] = arr[i-1];
        }
        arr[atIndex] = value;
        System.out.print("Sau khi chèn : ");
        for (int element : arr) {
            System.out.print(element + "\t");
        }
    }

}
