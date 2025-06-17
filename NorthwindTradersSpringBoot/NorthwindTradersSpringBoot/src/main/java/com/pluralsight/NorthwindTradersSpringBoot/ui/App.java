package com.pluralsight.NorthwindTradersSpringBoot.ui;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class App implements CommandLineRunner {
    @Autowired
    private ProductDao productDao;

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. List Products");
            System.out.println("2. Add Products");
            System.out.println("0. Exit");
            System.out.print("Choose one of the following.. ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                for (Product product : productDao.getAllProducts()) {
                    System.out.println(product);
                }
            } else if (choice == 2) {
                System.out.println("Product Id ");
                int productId = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Product Name ");
                String productName = scanner.nextLine();
                System.out.println("Category ");
                String category = scanner.nextLine();
                System.out.println("Price ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                productDao.addProduct(new Product(productId, productName, category, price));
            } else if (choice == 0) {
                break;
            }
        }

    }
}



