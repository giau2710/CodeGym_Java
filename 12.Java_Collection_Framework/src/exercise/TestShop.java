package exercise;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Shop shop = new Shop();
        shop.addProduct();
        shop.removeProduct();
        for (Product product : shop.ProductList) {
            System.out.println(product.name);
        }
    }
}
