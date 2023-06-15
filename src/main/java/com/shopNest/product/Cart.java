package com.shopNest.product;


import java.util.*;

public class Cart {
	  private List<Product> items;
	  
	  public Cart() {
	    items = new ArrayList<>();
	  }
	  
	  public void addItem(Product product) {
	    items.add(product);
	  }
	  
	  public List<Product> getItems() {
	    return items;
	  }
	  
	  public double getTotal() {
	    double total = 0.0;
	    for (Product item : items) {
	      total += item.getPprice();
	    }
	    return total;
	  }
	}
