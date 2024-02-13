package com.becoder.controller.ProductRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.becoder.controller.model.Product;

public interface productrepo extends JpaRepository<Product, Integer> {

}
