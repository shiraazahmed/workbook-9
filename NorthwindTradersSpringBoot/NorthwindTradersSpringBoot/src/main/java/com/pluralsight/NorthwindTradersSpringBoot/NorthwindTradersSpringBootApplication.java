package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import com.pluralsight.NorthwindTradersSpringBoot.ui.ProductDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
		ProductDao productDao = context.getBean(ProductDao.class);

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
				System.out.println("com.pluralsight.NorthwindTradersSpringBoot.models.Product Id ");
				int productId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("com.pluralsight.NorthwindTradersSpringBoot.models.Product Name ");
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

