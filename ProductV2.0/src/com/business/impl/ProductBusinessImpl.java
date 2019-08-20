package com.business.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.business.ProductBusiness;
import com.pojo.Product;

public class ProductBusinessImpl implements ProductBusiness{
	
	private Map<Integer,Product> productMap=new HashMap<>();
		
	
	public Product addProduct(Product product) {
	productMap.put(product.getPid(),product);
	
	return productMap.get(product.getPid());
	}
	
	@Override
	public Product updateProductPrice(int pid, double newPrice) {
		Set<Integer> allIds = productMap.keySet();
		Product pr = null;
		for(Integer x:allIds) {
			if(x.equals(pid)) {
				productMap.get(pid).setPrice(newPrice);
				pr= productMap.get(pid);
			}						
		}
		
	return pr;
}
	
	@Override
	public void deleteProduct(int pid) {
	productMap.remove(pid);
		
	}

	@Override
	public Product getProductsById(int pid) {
		return productMap.get(getAllProducts());
	}

	@Override
	public List<Product> getProductsByName(String name) {
		Set<Integer> ids = productMap.keySet();
		List<Product> prs = new ArrayList<Product>();
		for(Integer id:ids) {
			if(productMap.get(id).getName().equals(name)) {
				prs.add(productMap.get(id));
			}
			
		}
		// TODO Auto-generated method stub
		return prs;
	}
		
	
		
	

	@Override
	public List<Product> getAllProducts() {
		List <Product> prs = new ArrayList<Product> ();
		Set<Integer> ids = productMap.keySet();
		for(Integer x:ids) {
			prs.add(productMap.get(x));	
			
		}
		
		// TODO Auto-generated method stub
		return prs;
	}

	public Map<Integer,Product> getProductMap() {
		return productMap;
	}

	public void setProductMap(Map<Integer,Product> productMap) {
		this.productMap = productMap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productMap == null) ? 0 : productMap.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductBusinessImpl other = (ProductBusinessImpl) obj;
		if (productMap == null) {
			if (other.productMap != null)
				return false;
		} else if (!productMap.equals(other.productMap))
			return false;
		return true;
	}

	

	
	
	}
	

