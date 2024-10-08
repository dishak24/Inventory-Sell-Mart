package com.atoz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atoz.dto.CategoryResponse;
import com.atoz.dto.CommonApiResponse;
import com.atoz.model.Category;
import com.atoz.resource.CategoryResource;

@RestController
@RequestMapping("api/category")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {

	@Autowired
	private CategoryResource categoryResource;

	@GetMapping("all")
	public ResponseEntity<CategoryResponse> getAllCategories() {
		return categoryResource.getAllCategories();
	}

	@PostMapping("add")
	public ResponseEntity<CommonApiResponse> add(@RequestBody Category category) {
		return categoryResource.add(category);
	}

}
