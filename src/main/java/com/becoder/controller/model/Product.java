package com.becoder.controller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
  // public static final String HttpStatus = null;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int Id;
  private String ProductName;
  private String description;
  private String price;
  private String status;

  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
  }

  public String getProductName() {
    return ProductName;
  }

  public void setProductName(String productName) {
    ProductName = productName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
