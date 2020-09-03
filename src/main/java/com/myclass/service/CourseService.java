package com.myclass.service;

import com.myclass.dto.CourseDto;

import java.util.List;

public interface CourseService {
  List<CourseDto> findAll();
  CourseDto findById(int id);
}
