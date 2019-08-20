package com.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.business.ProductBusiness;
import com.business.impl.ProductBusinessImpl;
import com.pojo.Product;

public class ProductsMain {

	public static void main(String[] args) {

		ProductBusiness pb = new ProductBusinessImpl();
		Scanner sc = new Scanner(System.in);

		List<Product> productList = new LinkedList<>();
		
	    pb.addProduct(new Product(101,"TV",29.43,97.5f,"Sony"));
	    pb.addProduct(new Product(202,"Telephone",893.43,97.5f,"Bell"));
	    pb.addProduct(new Product(304,"Computer",93.4,1.5f,"IBM"));   
	    pb.addProduct(new Product(405,"Football",293.43,97.5f,"Wilson"));
	    pb.addProduct(new Product(603,"Mouse",3.43,97.5f,"HP"));

	    
		int ch = 0;

		do {
			System.out.println("Product Menu");
			System.out.println("_____________");
			System.out.println("1)Add Product");
			System.out.println("2)Update Price ");
			System.out.println("3)Get Product by the Product Id");
			System.out.println("4)Search product by name");
			System.out.println("5)View all products");
			System.out.println("6)Delete product");
			System.out.println("7)EXIT");
			System.out.println("Enter Your Choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter New Product");
				System.out.println();
				System.out.println("Enter a Product ID..");
				int id = sc.nextInt();
				System.out.println("Enter a Product Name...");
				String name = sc.next();
				System.out.println("Enter a Product Price...");
				double price = sc.nextDouble();
				System.out.println("Enter a Product Manufacturar...");
				String mf = sc.next();
				System.out.println("Enter The Product Ratings...");
				float rt = sc.nextFloat();
				Product nPr = new Product(id, name, price, rt, mf);
				System.out.println(nPr);
				pb.addProduct(nPr); 
				break;
			
			case 2:
				System.out.println("Enter the Product ID to Update Price ...");
				int searchId = sc.nextInt();
				System.out.println("Enter New Product Price...");
				double upPrice = sc.nextDouble();
				List<Product> output = new ArrayList<>();
				output.add(pb.updateProductPrice(searchId, upPrice));
				printProducts(output);
				break;
			case 3:
				System.out.println("Enter ID you want to search ....");
				int searchID = sc.nextInt();
				List<Product> output2 = new ArrayList<>();
				output2.add(pb.getProductsById(searchID));
				printProducts(output2);
				break;
			case 4:
				System.out.println("Enter Name for Product Search by name");
				String prName = sc.next();
				printProducts(pb.getProductsByName(prName));

				break;
			case 5:
				System.out.println("View All Product...");
				printProducts(pb.getAllProducts());
				break;
			case 6:
				System.out.println("Enter a ID for Deleting a Product...");
				int ids = sc.nextInt();
				pb.deleteProduct(ids);
				printProducts(pb.getAllProducts());
				break;
			case 7:
				System.out.println("Exit");
			default:
				System.out.println("Invalid input ...");
				break;
			}

		} while (ch != 7);

		sc.close();
	}

	private static void printProducts(ProductBusiness pb) {
		System.out.println(pb.getAllProducts());
		// TODO Auto-generated method stub
	}

	public static void printProducts(List<Product> productList) {
		System.out.println("Total " + productList.size() + " number of product/s are existing");
		for (int i = 0; i < productList.size(); i++) {
			System.out.println("Product ID : " + productList.get(i).getPid());
			System.out.println("Product Name : " + productList.get(i).getName());
			System.out.println("Product Price : " + productList.get(i).getPrice());
			System.out.println("Product Ratings : " + productList.get(i).getRatings());
			;
		}
	}

}
