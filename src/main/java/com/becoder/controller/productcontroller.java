package com.becoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.becoder.controller.model.Product;
import com.becoder.controller.services.productservice;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class productcontroller {
  @Autowired
  private productservice productservice;

  @PostMapping("/saveProducts")
  public ResponseEntity<?> saveProduct(@RequestBody Product product) {
    return new ResponseEntity<>(productservice.saveProduct(product), HttpStatus.CREATED);
  }

  @GetMapping("/")
  public ResponseEntity<?> getAllProduct() {
    return new ResponseEntity<>(productservice.getAllProduct(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getProductById(@PathVariable Integer id) {

    return new ResponseEntity<>(productservice.getProductById(id), HttpStatus.OK);
  }

  @GetMapping("/deleteProduct/{id}")
  public ResponseEntity<?> deleteProduct(@PathVariable Integer id) {
    return new ResponseEntity<>(productservice.deleteProduct(id), HttpStatus.OK);

  }

  @PostMapping("/editProduct/{id}")
  public ResponseEntity<?> editProduct(@RequestBody Product product,
      @PathVariable Integer id) {
    return new ResponseEntity<>(productservice.editProduct(product, id),
        HttpStatus.CREATED);
  }
}
