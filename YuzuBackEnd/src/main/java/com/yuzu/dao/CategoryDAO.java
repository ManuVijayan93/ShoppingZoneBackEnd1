package com.yuzu.dao;

import java.util.List;

import com.yuzu.domain.Category;
import com.yuzu.domain.Product;

public interface CategoryDAO {
	
	public List<Category> list();

	public boolean save(Category category);

	public boolean update(Category category);

	public boolean delete(Category category);

	public Category getCategoryByID(String id);

	public Category getCategoryByName(String name);

}
