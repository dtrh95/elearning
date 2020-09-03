package com.myclass.service.impl;

import com.myclass.dto.CourseDto;
import com.myclass.entity.Course;
import com.myclass.repository.CourseRepository;
import com.myclass.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServicImple implements CourseService {
  @Autowired
  CourseRepository courseRepository;
  @Override
  public List<CourseDto> findAll() {
    List<CourseDto> list = new ArrayList<>();
    List<Course> courses = courseRepository.findAll();
    for (Course item : courses) {
      list.add(new CourseDto(
        item.getId(),
        item.getTitle(),
        item.getImage(),
        item.getLecturesCount(),
        item.getHourCount(),
        item.getViewCount(),
        item.getPrice(),
        item.getDiscount(),
        item.getPromotionPrice(),
        item.getDescription(),
        item.getContent(),
        item.getCategoryId(),
        item.getLastUpdate(),
        item.getCategory()
      ));
    }
    return list;
  }
}
