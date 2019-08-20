package com.business;


import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pojo.Product;

public interface ProductBusiness {
	
	public static void main(String[] args) {
		
	
	
	}
	public Product addProduct(Product product);
	public Product updateProductPrice(int pid,double newPrice);
	public void deleteProduct(int pid);
	public Product getProductsById(int pid);
	public List<Product> getProductsByName(String name);
	public List<Product>getAllProducts();
	


}

