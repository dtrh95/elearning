package com.myclass.service;

import com.myclass.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
  List<CategoryDto> findAll();
}
