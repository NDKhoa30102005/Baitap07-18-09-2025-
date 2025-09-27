package com.example.demo.Service;

import com.example.demo.entity.Category;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface CategoryService {
    Page<Category> getAllCategories(int page, int size, String keyword);
    Category save(Category category);
    Optional<Category> getById(Long id);
    void delete(Long id);
}
