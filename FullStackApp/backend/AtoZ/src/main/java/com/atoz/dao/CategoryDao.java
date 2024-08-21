package com.atoz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atoz.model.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
