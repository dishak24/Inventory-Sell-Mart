package com.atoz.service;

import org.springframework.web.multipart.MultipartFile;

import com.atoz.model.Product;

public interface ProductService {
	
	void addProduct(Product product, MultipartFile productImmage);

}
