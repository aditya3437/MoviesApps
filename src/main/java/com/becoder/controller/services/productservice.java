package com.becoder.controller.services;

import java.util.List;

import com.becoder.controller.model.Product;

public interface productservice {
  public Product saveProduct(Product product);

  public List<Product> getAllProduct();

  public Product getProductById(Integer id);  

  public String deleteProduct(Integer id);

  public Product editProduct(Product product, Integer id);

}
