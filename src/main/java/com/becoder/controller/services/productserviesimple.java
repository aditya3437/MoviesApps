package com.becoder.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.becoder.controller.ProductRepo.productrepo;
import com.becoder.controller.model.Product;

@Service
public class productserviesimple implements productservice {
  @Autowired
  private productrepo ProductReposi;

  @Override
  public String deleteProduct(Integer id) {
    Product Prod = ProductReposi.findById(id).get();

    if (Prod != null) {
      ProductReposi.delete(Prod);
      return "Product deleted successfully";

    }
    return "something wrong on server";

  }

  @Override
  public List<Product> getAllProduct() {

    return ProductReposi.findAll();
  }

  @Override
  public Product getProductById(Integer id) {

    return ProductReposi.findById(id).get();
  }

  @Override
  public Product saveProduct(Product product) {

    return ProductReposi.save(product);
  }

  @Override
  public Product editProduct(Product p, Integer id) {
    Product oldProduct = ProductReposi.findById(id).get();
    oldProduct.setProductName(p.getProductName());
    oldProduct.setDescription(p.getDescription());
    oldProduct.setPrice(p.getPrice());
    oldProduct.setStatus(p.getStatus());

    return ProductReposi.save(oldProduct);

  }

}
