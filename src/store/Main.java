package store;
import java.util.Scanner;
import classes.ProductList;
import classes.Seller;
import classes.Product;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		boolean salir = false;
		int comision;
		String option;
		String productName;
		String productCode;
		String productPrice;
		String productCategory;
		String seller;
		ProductList productList = new ProductList();
		
		while (!salir) {

			System.out.println("Welcome to the virtual store.");
			System.out.println(" "); 
			System.out.println("1. Add product.");
			System.out.println("2. Remove product.");
			System.out.println("3. Search product in category.");
			System.out.println("4. Show my product list.");
			System.out.println("5. Exit.");
			
			System.out.println("Please, choose an option to start buying ");
			option = scan.nextLine();
			
			switch (option) {
		
			case "1":
				System.out.println("Input product name");
				productName = scan.nextLine();
				System.out.println("Input product Code.");
				productCode = scan.nextLine();
				System.out.println("Input product price.");
				productPrice = scan.nextLine();
				System.out.println("Input product category.");
				productCategory = scan.nextLine();
				productList.addProduct(productName, productCode, productPrice, productCategory);
				System.out.println(productName + " was added in your list.");
				break;
			case "2":
				System.out.println("Input product name.");
				productName = scan.nextLine();
				productList.searchProduct(productName);
				if (productList.searchProduct(productName) == null) {
					System.out.println(productName + " not found in the list.");
				} else {
					productList.removeProduct(productName);
					System.out.println(productName + " has been deleted of your list.");
				}
				break;
			case "3":
				System.out.println("Input product name.");
				productName = scan.nextLine();
				if (productList.searchProduct(productName) != null) {
					System.out.println(productName + " was found in your list.");
				} else {
					System.out.println(productName + " not found in your list.");
				}
				break;
			case "4":
				System.out.println("Your shooping list: " + productList);
				break;
			case "5":
				salir = true;
				break;
			}
		
		}
		
		for (int i=0; i < productList.size(); i++){
			if (productList.size <= 2) {
				comision = getProductPrice(i) * 0.05;
				return comision;
				
			if (productList.size > 2) {
				comision = getProductPrice(i) * 0.10;
				return comision;
			}
		System.out.println("Input seller ");	
		seller = scan.nextLine();
		System.out.println("Comision of seller "+ seller + " is: " + comision);
		}
		}
	}
	
	}


