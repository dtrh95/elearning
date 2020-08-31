package com.myclass.service.impl;

import com.myclass.dto.CategoryDto;
import com.myclass.entity.Category;
import com.myclass.repository.CategoryRepository;
import com.myclass.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackOn = Exception.class)
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  CategoryRepository categoryRepository;

  @Override
  public List<CategoryDto> findAll() {
    List<CategoryDto> dtos = new ArrayList<>();

    List<Category> categories = categoryRepository.findAll();
    for (Category category : categories) {
      dtos.add(new CategoryDto(category.getId(), category.getTitle(), category.getIcon()));
    }
    return dtos;
  }
}
