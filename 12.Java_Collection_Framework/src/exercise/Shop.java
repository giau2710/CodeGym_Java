package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    ArrayList<Product> ProductList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    void addProduct() {
        Product product = new Product();

        System.out.print("Nhap name: ");
        product.name = input.nextLine();
        System.out.print("Nhap description:");
        product.description = input.nextLine();

        do {
            System.out.print("Nhap price: ");
            product.price = input.nextDouble();
        } while (!(product.price > 0 && product.price < 1000));
        System.out.print("Input number of rate: ");
        product.rate = new int[input.nextInt()];
        for (int i = 0; i < product.rate.length; i++) {
            do {
                System.out.printf("Rate %d: ", i + 1);
                product.rate[i] = input.nextInt();

            } while (!(product.rate[i] >= 1 && product.rate[i] <= 5));

        }
        ProductList.add(product);
    }

    void removeProduct(Scanner input) {
        System.out.println("Input name of product you want to remo: ");
        String name = this.input.nextLine();
        input.nextLine();
        boolean yesOrNo = false;
for (Product product:ProductList) {
    if(product.equals(name)){
        yesOrNo=true;
        ProductList.remove(product);
        break;
    }else {
        System.out.println("NOt found");
    }
}
    }

}
